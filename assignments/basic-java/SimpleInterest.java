package com.gunjana.Assignment._02_FirstJava;

import java.util.Scanner;

/** PROGRAM 03 : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest. **/

public class SimpleInterest {
    public static void main(String[] args) {
        float P, R;
        int T;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        P = in.nextFloat();

        System.out.print("Enter Time  : ");
        T = in.nextInt();

        System.out.print("Enter Rate of interest : ");
        R = in.nextFloat();

        float si = (P * T * R) / 100;
        System.out.println("Simple Interest = " + si );
    }
}
