package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 06 : Calculate Commission Percentage
 *
 * **/

public class Commission {
    public static void main(String[] args) {

        // APPROACH 1

        Scanner in = new Scanner(System.in);
        float price, commission;
        System.out.print("Enter total Price : ");
        price = in.nextFloat();
        System.out.print("Enter commission percentage : ");
        commission = in.nextFloat();
        float amount = (price - (price * commission) / 100);
        System.out.println("Commission : " + amount);

        // APPROACH 2

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Soled Price : ");
        float amt = inp.nextFloat();
        float comm;

        if(amt < 1000) {
            comm = (amt - (amt * 80) / 100);       // Subtracting 80% from soled price
        } else if (amt < 2000) {
            comm = (amt - (amt * 75) / 100);       // Subtracting 75% from soled price
        } else if (amt < 3000) {
            comm = (amt - (amt * 70) / 100);       // Subtracting 70% from soled price
        } else {
            comm = (amt - (amt * 65) / 100);       // Subtracting 65% from soled price
        }
        System.out.println("Commission = " + comm);
    }
}
