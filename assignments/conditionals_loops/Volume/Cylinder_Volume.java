package com.gunjana.Assignment.Conditionals_loops.Volume;

import java.util.Scanner;

// PROGRAM 16 : Volume of Cylinder.

public class Cylinder_Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r, h;
        System.out.println("Enter the radius : ");
        r = in.nextFloat();
        System.out.println("Enter the height : ");
        h = in.nextFloat();

        double vol = (3.14 * (r * r) * h);           // vol = pi * (r^2) * h   (area of base x height)
        System.out.println("Volume = " + vol);
    }
}
