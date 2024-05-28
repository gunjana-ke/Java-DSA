package com.gunjana.conditionals_loops;

import java.util.Scanner;

// CALCULATOR PROGRAM : Takes input until the user does not press x

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {

            System.out.println("Enter the operator : ");
            char op = in.next().trim().charAt(0);           // trim() removes the blank spaces


            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter 2 numbers : ");    // Only is the operator matches take input of numbers
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '*') {
                    ans = n1 * n2;
                }
                if (op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    } else
                        System.out.println("Invalid!");
                }
                if (op == '%')
                    ans = n1 % n2;
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
            System.out.println("Solution = " + ans);
        }

    }
}
