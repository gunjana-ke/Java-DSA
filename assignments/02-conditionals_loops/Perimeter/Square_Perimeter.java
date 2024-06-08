package com.gunjana.Assignment.Conditionals_loops.Perimeter;

import java.util.Scanner;

// PROGRAM 12 : Perimeter of Square.

public class Square_Perimeter {
    public static void main(String[] args) {
        float a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        a = in.nextFloat();

        float peri = 4 * a;                         // peri = 4 * side;
        System.out.println("Perimeter = " + peri);
    }
}
