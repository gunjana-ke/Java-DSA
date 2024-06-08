package com.gunjana.Assignment.Conditionals_loops.Volume;

import java.util.Scanner;

// PROGRAM 17 : Volume of Sphere.

public class Sphere_Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r;
        System.out.print("Enter the radius : ");
        r = in.nextFloat();

        double vol = (4 * (3.14) * (r * r * r )) / 3;       // vol = (4/3) * pi * (r^3);   (area of base x height)
        System.out.println("Volume = " + vol);
    }
}
