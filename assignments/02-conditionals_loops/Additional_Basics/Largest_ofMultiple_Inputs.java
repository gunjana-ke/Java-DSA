package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// PROGRAM 25 : Take integer inputs till the user enters 0 and print the largest number from all.

public class Largest_ofMultiple_Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, max = 0;
        System.out.print("Enter a number : ");     // num cannot be initialized to 0 so take an i/p first
        num = in.nextInt();
        max = num;

        while (num != 0){
            System.out.print("Enter a number and to stop enter '0' : ");
            num = in.nextInt();
            if(num > max)
                max = num;
        }
        System.out.println("Maximum = " + max);
    }
}
