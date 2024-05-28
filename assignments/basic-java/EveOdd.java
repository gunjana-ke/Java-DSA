package com.gunjana.Assignment._02_FirstJava;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

/** Program 01: Write a program to print whether a number is even or odd, also take input from the user. **/

public class EveOdd {
    public static void main(String[] args) {
        int num;                                    // Declaration of num variable
        Scanner in = new Scanner(System.in);        // Object creation : 'in' is now the object to take i/p
        System.out.print("Enter a number : ");
        num = in.nextInt();                         // Asking for an int value
        if (num%2 == 0){
            System.out.println(num + " Is an Even number");  // True block
        } else {
            System.out.println(num + " Is an Odd number");   // False block
        }
    }

}
