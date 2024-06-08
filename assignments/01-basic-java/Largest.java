package com.gunjana.Assignment._02_FirstJava;

import java.util.Scanner;

/** PROGRAM 05 : Take 2 numbers as input and print the largest number. **/

public class Largest {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        a = in.nextInt();
        b = in.nextInt();

        if(a > b){
            System.out.println(a + " Is Greater.");
        } else {
            System.out.println(b + " Is Greater.");
        }
    }
}
