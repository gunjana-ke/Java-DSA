package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 12 : LCM Of Two Numbers
 *
 *  LCM (Least Common Multiple) :
 *  is the largest of the two stated numbers that can be divided by both the given numbers.
 *  Example : x = 15, y = 25
 *            LCM = 5 x 5 x 3 = 75
 * **/

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        int res = Math.max(x,y);
        while (res > 0){
            if(res % x == 0 && res % y == 0){
                break;
            }
            res++;
        }
        System.out.println("LCM of (" + x + ", " + y + ") = " + res);
    }
}
