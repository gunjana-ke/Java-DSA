package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 05 : Calculate the Distance  between two points
 *
 *  Distance = root(((x2-x1)^2) + ((y2-y1)^2)
 *  where x1, x2 are x coordinates
 *  and,  y1, y2 are y coordinates
 * **/

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x coordinates : ");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        System.out.print("Enter the y coordinates : ");
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        float x = (float) Math.pow((x2 - x1), 2);          // (x2 - x1)^2
        float y = (float) Math.pow((y2 - y1), 2);          // (y2 - y1)^2
        double distance = Math.sqrt(x + y);                // root(x + y)

        System.out.println("Distance = " + distance);
    }
}
