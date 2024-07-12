package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 19 : HCF Of Two Numbers Program
 *  Refer : https://www.geeksforgeeks.org/program-to-find-gcd-or-hcf-of-two-numbers/
 *  HCF(Highest Common Factor) of two numbers is the largest number that divides both of them.
 *  Example : 36 =  2 x 2 x 3 x 3
 *            60 =  2 x 2 x 3 x 5
 *      HCF : Multiplication of common factors
 *            = 2 x 2 x 3
 *            => 12
 * **/

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        int res = Math.min(x, y);
        while (res > 0){
            if(x % res == 0 && y % res == 0){
                break;
            }
            res--;
        }

        System.out.println("HCF of (" + x + ", " + y + ") = " + res);
    }
}
