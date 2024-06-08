package com.gunjana.Assignment.Conditionals_loops.Area;

import java.util.Scanner;

// PROGRAM 03 : Area of Rectangle

public class RectangleArea {
    public static void main(String[] args) {
        float l, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length : ");
        l = in.nextFloat();
        System.out.print("Enter Breadth : ");
        b = in.nextFloat();

        float area = l * b;
        System.out.println("Area = " + area);
    }
}
