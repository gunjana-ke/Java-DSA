package com.gunjana.Assignment.Conditionals_loops.Volume;

import java.util.Scanner;

// PROGRAM 14 : Volume of Cone

public class Cone_Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r, h;
        System.out.print("Enter the radius : ");
        r = in.nextFloat();
        System.out.print("Enter the height : ");
        h = in.nextFloat();

        double vol = (1 * (3.14) * (r * r) * h) / 3;       // vol = (1/3) * pi * (r^2) * h  (area of base x height)
        System.out.println("Volume = " + vol);
    }
}
