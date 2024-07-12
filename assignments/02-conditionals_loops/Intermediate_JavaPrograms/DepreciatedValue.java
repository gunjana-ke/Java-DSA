package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 08 : Calculate Depreciation of Value
 *  GFG Explanation : "https://www.geeksforgeeks.org/program-to-find-the-depreciation-of-value/"
 *  The value of any article or item subject to wear and tear,
 *  decreases with time. This decrease is called its DEPRECIATION.
 *  Three values : V1 -> Initial Value
 *                 R  -> Rate of depreciation
 *                 T  -> Time in years
 *  Value (V2) at the end of certain time :
 *  V2 = V1 (1-r/100)^t
 * **/

public class DepreciatedValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float v1, r, t;
        System.out.println("Enter the Initial Value : ");
        v1 = in.nextFloat();
        System.out.println("Enter the Rate of Depreciation : ");
        r = in.nextFloat();
        System.out.println("Enter Time in Years : ");
        t = in.nextFloat();

        float v2 = (float) (v1 * (Math.pow((1-r/100), t)));
        System.out.println("Final Value after " + t + "Years = " + v2);
    }
}
