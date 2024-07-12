package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 17 : Find if a number is palindrome or not **/

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt(), newnum;
        int temp = num, rev = 0, rem;
        while (num > 0){
            rem = (num % 10);
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println(rev);
        if (rev == temp){
            System.out.println(temp + " Is a Palindrome.");
        } else {
            System.out.println(temp + " Is not a Palindrome.");
        }
    }
}
