package com.gunjana.Assignment.Conditionals_loops.Perimeter;

import java.util.Scanner;

// PROGRAM 11 : Perimeter of Rectangle

public class Rectangle_Perimeter {
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
