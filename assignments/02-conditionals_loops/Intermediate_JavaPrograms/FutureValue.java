package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 18 : Future Investment Value **/

public class FutureValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p, r, t;
        System.out.print("Enter Present Value : ");
        p = in.nextFloat();
        System.out.print("Enter Rate of Interest : ");
        r = in.nextFloat();
        System.out.print("Enter Number of compounding periods : ");
        t = in.nextFloat();

        double futureValue = p + ((p * t * r) / 100) ;
        System.out.println("Present Value = " + p);
        System.out.println("Future Value = " + futureValue);
    }
}
