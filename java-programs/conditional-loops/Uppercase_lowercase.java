package com.gunjana.conditionals_loops;

import java.util.Scanner;

// Program to find if the given character is UPPERCASE or lowercase

public class Uppercase_lowercase {
    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character : ");
        ch = in.next().trim().charAt(0);        // trim() removes the blank spaces before and after the string
                                                // charAt(0) takes the character at the 0th index of the string

        if(ch >= 'a' && ch <= 'z'){             // Defining the range for lowercase (can also use ASCII values)
            System.out.println(ch + " IS Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " Is Uppercase");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
