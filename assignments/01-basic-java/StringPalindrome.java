package com.gunjana.Assignment._02_FirstJava;


import java.util.Scanner;

/** PROGRAM 08 : To find out whether the given String is Palindrome or not. **/

public class StringPalindrome {
    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        word = in.next();
        String rev = "";
        int len = word.length() - 1;        // Index always starts from 0, so we reduce it by '-1'
        for(int i = len; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        System.out.println("Your String : " + word);
        System.out.println("Reversed String : " + rev);
        if(word.equals(rev)){                      // The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
