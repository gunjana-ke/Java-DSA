package com.gunjana.Assignment.Conditionals_loops.Volume;

import java.util.Scanner;

// PROGRAM 15 : Volume of Prism

public class Prism_Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b, h, l;
        System.out.print("Enter the base : ");
        b = in.nextFloat();
        System.out.print("Enter the height : ");
        h = in.nextFloat();
        System.out.print("Enter the length : ");
        l = in.nextFloat();

        float vol = (1 * b * h * l) / 2;            // vol = (l * b * h) / 2;   (area of base x height)
        System.out.println("Volume = " + vol );
    }
}
