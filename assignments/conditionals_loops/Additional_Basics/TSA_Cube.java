package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// PROGRAM 20 : Total Surface Area Of Cube.

public class TSA_Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a;
        System.out.print("Enter the side : ");
        a = in.nextFloat();

        float tsa = (6 * (a*a));         // TSA = 6a^2;
        System.out.println("Total Surface Area Of Cube = " + tsa);
    }
}
