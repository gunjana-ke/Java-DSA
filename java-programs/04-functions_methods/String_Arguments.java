package com.gunjana.DsaJava.Functions_methods;

import java.util.Scanner;

public class String_Arguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        String personalised = greets(name);
        System.out.println(personalised);
    }

    static String greets(String name) {
        String message = "Hello " + name + "!";        //Concatenation
        return message;
    }
}
