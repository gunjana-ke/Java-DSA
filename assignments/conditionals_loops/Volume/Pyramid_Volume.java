package com.gunjana.Assignment.Conditionals_loops.Volume;

import java.util.Scanner;

// PROGRAM 18 : Volume of Pyramid

public class Pyramid_Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l, w, h;
        System.out.print("Enter the length : ");
        l = in.nextFloat();
        System.out.print("Enter the width : ");
        w = in.nextFloat();
        System.out.print("Enter the height : ");
        h = in.nextFloat();

        float vol = (l * w * h) / 3;            // (l * w * h) / 3   (area of base x height)
        System.out.println("Volume = " + vol);
    }
}
