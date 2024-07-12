package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 07 : Power in Java
 *  Ex : if number = 2 and power = 3
 *  answer = 2^3 = 8
 * **/

public class PowerInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = in.nextInt();
        System.out.println("Enter the power : ");
        int pow = in.nextInt();
        float sol = (float) Math.pow(num, pow);
        System.out.println("Solution = " + sol);
    }
}
