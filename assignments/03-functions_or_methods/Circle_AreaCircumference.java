package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 6 : Write a program to print the circumference and
 *              area of a circle of radius entered by user by defining your own method.
 *
 *  Refer : https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/
 **/

public class Circle_AreaCircumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius;
        System.out.print("Enter the radius of the circle : ");
        radius = in.nextFloat();

        float cir = circum(radius);
        float area = area(radius);

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + cir);
    }

    static float circum(float r) {
        float pi = (float) 3.14;
        float c = 2 * pi * r;
        return c;
    }

    static float area(float r) {
        float pi = (float) 3.14;
        float c = pi * r * r;
        return c;
    }
}
