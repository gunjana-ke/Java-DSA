package com.gunjana.Assignment.Conditionals_loops.Perimeter;

import java.util.Scanner;

// PROGRAM 10 : Perimeter of Parallelogram.

public class Parallelogram_Perimeter {
    public static void main(String[] args) {
        float l, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 sides : ");
        l = in.nextFloat();
        b = in.nextFloat();

        float peri = 2 * (l + b);                   // peri = 2l + 2b;
        System.out.println("Perimeter = " + peri);
    }
}
