package com.gunjana.DsaJava.switch_statements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit : ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango" :
                System.out.println("King of Fruits.");
                break;
            case "Apple" :
                System.out.println("A sweet red Apple.");
                break;
            case "Orange" :
                System.out.println("Round Fruit.");
                break;
            case "Grapes" :
                System.out.println("Small Fruit.");
                break;
            default:
                System.out.println("Please enter a valid fruit!");
        }
    }
}
