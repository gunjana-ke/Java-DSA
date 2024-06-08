package com.gunjana.Assignment.Conditionals_loops.Perimeter;

import java.util.Scanner;

// PROGRAM 08 : Perimeter of Circle

public class Circle {
    public static void main(String[] args) {
        float rad;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        rad = in.nextFloat();

        double peri = (2 * 3.14 * rad);                 // peri = 2 * pi * r ;
        System.out.println("Perimeter = " + peri);
    }
}
