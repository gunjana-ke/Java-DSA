package com.gunjana.Assignment.Conditionals_loops.Perimeter;

import java.util.Scanner;

// PROGRAM 13 : Perimeter of Rhombus

public class Rhombus_Perimeter {
    public static void main(String[] args) {
        float a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side : ");
        a = in.nextFloat();

        float peri = 4 * a;                         // peri = 4 * side;
        System.out.println("Perimeter = " + peri);
    }
}
