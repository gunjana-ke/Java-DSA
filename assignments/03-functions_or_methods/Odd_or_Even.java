package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 02 : Check if a Given Integer is Odd or Even
 *  Refer : https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
 * **/

// APPROACH 02

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int last_dig = num % 10;

        if(even(last_dig) == 1){
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

    static int even (int n){
        int res = switch (n) {
            case 0, 2, 4, 6, 8 -> 1;
            default -> 0;
        };
        return res;
    }
}
