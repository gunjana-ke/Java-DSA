package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// PROGRAM 24 : Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop).

public class Sum_OfMultiple_inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter a number : ");     // num cannot be initialized to 0 so take an i/p first
        num = in.nextInt();
        sum += num;                                  // update sum so that we do not lose the input out of loop
        while (num != 0){                            // while num = 0 : exit and print the sum
            System.out.println("Enter a number and to stop enter '0' : ");
            num = in.nextInt();
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
