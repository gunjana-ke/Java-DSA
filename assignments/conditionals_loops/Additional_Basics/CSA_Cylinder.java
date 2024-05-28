package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// PROGRAM 19 : Curved Surface Area Of Cylinder.(Lateral Surface Area)

public class CSA_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rad, h;
        System.out.print("Enter the radius : ");
        rad = in.nextFloat();
        System.out.print("Enter the height : ");
        h = in.nextFloat();

        float csa = (float) (2 * (3.14) * rad * h);   // CSA = 2*(pi)*r*h;
        System.out.println("Curved Surface Area Of Cylinder = " + csa);
    }
}
