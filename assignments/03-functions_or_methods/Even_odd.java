package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 02 : Check if a Given Integer is Odd or Even
 *  Refer : https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
 * **/

// APPROACH 01

public class Even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();

        boolean res = even(num);
        if (res)
            System.out.println(num + " is Even.");
        else
            System.out.println(num + " is Odd.");
    }

    static boolean even(int num) {
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
