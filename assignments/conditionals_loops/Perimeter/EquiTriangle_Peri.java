package com.gunjana.Assignment.Conditionals_loops.Perimeter;

import java.util.Scanner;

// PROGRAM 09 : Perimeter of an Equilateral Triangle.

public class EquiTriangle_Peri {
    public static void main(String[] args) {
        float a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        a = in.nextFloat();

        float peri = 3 * a;                         // peri = 3 * side
        System.out.println("Perimeter = " + peri);
    }
}
