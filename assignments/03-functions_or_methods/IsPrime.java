package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 07 : Define a method to find out if a number is prime or not.
 *  Refer : https://www.geeksforgeeks.org/java-prime-number-program/
 * **/

// Optimized Approach

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = in.nextInt();

        boolean prime = isPrime(num);

        if (prime)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is NOT a Prime number.");
    }

    static boolean isPrime(int num) {
        int c = 2;
        while (c * c < num){
            if (num % c == 0)
                return false;
            c++;
        }
        return c * c > num;
    }
}
