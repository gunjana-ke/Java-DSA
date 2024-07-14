package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 1 : Find the Minimum and Maximum of 3 numbers
 *  Refer : https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html
 **/

// APPROACH 02

public class Min_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first, second, third;
        System.out.print("Enter first number : ");
        first = in.nextInt();
        System.out.print("Enter second number : ");
        second = in.nextInt();
        System.out.print("Enter third number : ");
        third = in.nextInt();
        int min = min(first, second, third);
        int max = max(first, second, third);
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);
    }

    static int min (int a, int b, int c){
        int min = a;

        if (b < min){
            min = b;
        } else {
            min = c;
        }

        return min;
    }

    static int max (int a, int b, int c){
        int max = a;

        if (b > max){
            max = b;
        } else {
            max = c;
        }

        return max;
    }
}
