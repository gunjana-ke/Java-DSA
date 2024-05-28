package com.gunjana.Assignment.Conditionals_loops.Area;

import java.util.Scanner;

// PROGRAM 07 : Area of Equilateral Triangle.

public class EquileralTriangle_Area {
    public static void main(String[] args) {
        float a;
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the side : ");
        a = in.nextFloat();

        double Area = (Math.sqrt(3) / 4) * (a * a);
        System.out.println("Area = " + Area);
    }
}
