package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 10 : Write a function to find if a number is a palindrome or not. Take number as parameter.
 *  Refer : https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/
 **/

public class Is_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        if (isPalindrome(num))
            System.out.println(num + " is Palindrome.");
        else
            System.out.println(num + " is NOT Palindrome.");
    }

    static boolean isPalindrome(int num){
        int temp = num;
        int rev = 0;
        while (num > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        return temp == rev;
    }
}
