package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 09 : Write a program to print the factorial of a number by defining a method named 'Factorial'.
 *               Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
 *               E.g.-
 *                  4! = 1 * 2 * 3 * 4 = 24
 *                  3! = 3 * 2 * 1 = 6
 *                  2! = 2 * 1 = 2
 *               Also,
 *                  1! = 1
 *                  0! = 1
 *  Refer : https://www.javatpoint.com/factorial-program-in-java
 **/

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        System.out.println(n + "! = " + fact(n));
    }

    static int fact(int n){
        int factorial = 1;
        if (n == 0 || n == 1){
            factorial = 1;
        } else {
            while (n >= 1) {
                factorial = factorial * n;
                n--;
            }
        }
        return factorial;
    }
}
