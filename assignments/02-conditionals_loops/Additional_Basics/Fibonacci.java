package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// PROGRAM 21 : Fibonacci Series In Java Programs

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int a = 0, b = 1;

        while (num > 0){
            System.out.print(a + " ");
            int temp = b;               // Store val of b in temp before manipulating it.
            b = b + a;
            a = temp;
            num--;
        }
    }
}
