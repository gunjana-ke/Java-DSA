package com.gunjana.Assignment.Conditionals_loops.Area;

import java.util.Scanner;

// PROGRAM 06 : Area of Rhombus

public class RhombusArea {
    public static void main(String[] args) {
        float d1, d2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two diagonals : ");
        d1 = in.nextFloat();
        d2 = in.nextFloat();

        float Area = (1 * d1 * d2) / 2;
        System.out.println("Area = " + Area);
    }
}
