package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// PROGRAM 26 : Addition Of Two Numbers.

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter 2 numbers : ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
