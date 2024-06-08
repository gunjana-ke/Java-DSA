package com.gunjana.Assignment.Conditionals_loops.Area;

import java.util.Scanner;

// PROGRAM 4 : Area Of Isosceles Triangle

public class IsoscelesTriangle_Area {
    public static void main(String[] args) {
        float h, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base : ");
        b = in.nextFloat();
        System.out.print("Enter Height : ");
        h = in.nextFloat();

        float Area = (1 * b * h) / 2;
        System.out.println("Area = " + Area);
    }
}
