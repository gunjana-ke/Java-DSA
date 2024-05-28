package com.gunjana.Assignment.Conditionals_loops.Area;

import java.util.Scanner;

// PROGRAM 1 : Area of Circle

public class CircleArea {
    public static void main(String[] args) {
        float r;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        r = in.nextFloat();
        float Area;

        Area = (float) (3.14 * (r * r));         // Area = pi * (r^2)
        System.out.println("Area = " + Area);
    }
}
