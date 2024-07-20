package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 12 : Write a function to check if a given triplet is a Pythagorean triplet or not.
 *               A Pythagorean triplet is when the sum of the square of two numbers is equal to
 *               the square of the third number.
 **/

public class PyhagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the triplet : ");
        int t1, t2, t3;
        t1 = in.nextInt();
        t2 = in.nextInt();
        t3 = in.nextInt();

        boolean triplet = isTriplet(t1, t2, t3);
        if (triplet)
            System.out.println("(" + t1 + ", " + t2 + ", " + t3 + ",) is a Pyhagorean Triplet" );
        else
            System.out.println("(" + t1 + ", " + t2 + ", " + t3 + ",) is NOT a Pyhagorean Triplet" );
    }

    static boolean isTriplet(int t1, int t2, int t3){
        int a = t1 * t1;
        int b = t2 * t2;
        int c = t3 * t3;
        if(a + b == c || b + c == a || a + c == b){
            return true;
        }else {
            return false;
        }

    }
}
