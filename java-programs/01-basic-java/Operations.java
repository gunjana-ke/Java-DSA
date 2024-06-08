package com.gunjana.Assignment._02_FirstJava;


import java.util.Scanner;

/** PROGRAM 04 : Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions). **/

public class Operations {
    public static void main(String[] args) {
        int num1, num2, res = 0;
        char op;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.print("Enter the operator : ");
        op = in.next().charAt(0);

        if (op == '+'){
            res = num1 + num2;
        } else if (op == '-') {
            res = num1 - num2;
        } else if (op == '*') {
            res = num1 * num2;
        } else if (op == '/') {
            if (num2 == 0) {
                System.out.println("Denominator cannot be zero : Undefined");
                return;
            }
            else
                res = num1/num2;
        } else {
            System.out.println("Invalid input! ");
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + res);
    }
}
