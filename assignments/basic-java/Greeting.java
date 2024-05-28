package com.gunjana.Assignment._02_FirstJava;

import java.util.Scanner;

/** Program 02 : Take name as input and print a greeting message for that particular name. **/

public class Greeting {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = in.next();
        System.out.println("Hello " + name);
    }
}
