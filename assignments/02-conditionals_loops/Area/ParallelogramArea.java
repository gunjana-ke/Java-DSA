package com.gunjana.Assignment.Conditionals_loops.Area;

import java.util.Scanner;

// PROGRAM 5 : Area Of Rhombus

public class ParallelogramArea {
    public static void main(String[] args) {
        float b, h;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        b = in.nextFloat();
        System.out.print("Enter the Height : ");
        h = in.nextFloat();

        float Area = (b * h);
        System.out.println("Area = " + Area);
    }
}
