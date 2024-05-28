package com.gunjana.conditionals_loops;

import java.util.Scanner;



// Program to reverse the number

public class Reverse {
    public static void main(String[] args) {

        // APPROACH 1

        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = in.nextInt();
        int rem;

        while (num > 0){
            rem = num % 10;                 // Provides unit digit
            System.out.print(rem + "");     // Prints the unit digit
            num /= 10;                      // Excludes the unit digit and loop continues
        }
        System.out.println();

        // APPROACH 2

        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = inp.nextInt();
        int ans = 0, r;
        while (n > 0){
            r = n % 10;         // Provides last digit of the number
            n /= 10;            // Excludes last digit of the number

            ans = ans * 10 + r;    // if n=452
                                   // I1 : 0 + 2 = 2
                                   // I2 : 20 + 5 = 25
                                   // I3 : 250 + 4 = 254
        }
        System.out.println(ans);
    }
}
