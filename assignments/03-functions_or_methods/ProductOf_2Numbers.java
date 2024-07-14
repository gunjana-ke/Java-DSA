package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 05 : Define a method that returns the product of two numbers entered by user.
 *  Refer : https://code4coding.com/java-program-to-multiply-two-numbers-using-method/
 * **/

public class ProductOf_2Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter second number : ");
        int num2 = in.nextInt();

        int res = product(num1, num2);
        System.out.println("Product = " + res);
    }

    static int product(int a, int b){
        return a * b;
    }
}
