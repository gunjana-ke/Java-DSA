package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 04 : Write a program to print the sum of two numbers entered by user by defining your own method.
 *  Refer : https://code4coding.com/addition-of-two-numbers-in-java-using-method/
 * **/

public class SumOf_2Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter second number : ");
        int num2 = in.nextInt();

        int res = sum(num1, num2);
        System.out.println("Sum = " + res);
    }

    static int sum(int a, int b){
        return a + b;
    }
}
