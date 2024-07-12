package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 11 : Compound Interest Java Program
 *  Refer the link for Complete understanding : https://www.geeksforgeeks.org/java-program-for-compound-interest/
 *
 *  Compound Interest is given by :
 *  -> Compound Interest (C.I.)=Amount (A)-Principal (P)
 *
 *  And Amount is given by :
 *  -> Amount = P(1 + R/100)^t
 *  Where,
 *  - P is principal amount
 *  - R is the rate and
 *  - T is the time span
 *
 * **/

public class CompoundInterest {
    public static void main(String[] args) {
        float P, T, R, Amount, CompInterest;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
            P = in.nextFloat();
        System.out.print("Enter Time Period : ");
            T = in.nextFloat();
        System.out.print("Enter Rate of Interest : ");
            R = in.nextFloat();

        Amount = (float) (P * (Math.pow((1 + R / 100), T)));
        System.out.println("Total Amount = " + Amount);
        CompInterest = Amount - P;
        System.out.println("Compound Interest = " + CompInterest);
    }
}
