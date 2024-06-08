package com.gunjana.Assignment.Conditionals_loops.Area;

import java.util.Scanner;

// PROGRAM 02 : Area Of Triangle

public class TriangleArea {
    public static void main(String[] args) {
        float h, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base : ");
        b = in.nextFloat();
        System.out.print("Enter Height : ");
        h = in.nextFloat();

        float Area = (float) (0.5 * b * h);          // Type Casting
        System.out.println("Area = " + Area);

    }
}
