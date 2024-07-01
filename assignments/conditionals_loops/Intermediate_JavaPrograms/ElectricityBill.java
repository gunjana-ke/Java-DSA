package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;


import java.util.Scanner;

/** PROGRAM 02 : CALCULATE ELECTRICITY BILL
 *  Calculate the total electricity bill according to the following conditions:
 *
 *  For first 50 units -> Rs. 0.50/units
 *  For next 100 units -> Rs. 0.75/units
 *  For next 100 units -> Rs. 1.20/units
 *  For unit above 250 units -> Rs. 1.50/units
 *  An additional surcharge of 20% is added to the bill
 *
 * **/
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int units;
        float total = 0;
        System.out.print("Enter the units of consumed : ");
        units = in.nextInt();

        if (units <= 50) {
            total  = (float) (units * 0.5);
        } else if (units <= 150) {
            total = (float) ((50 * 0.5) + ((units-50) * 0.75));
        } else if (units <= 250) {
            total = (float) ((50 * 0.5) + (100 * 0.75) + ((units-150) * 1.2));
        } else if (units > 250) {
            total = (float) ((50 * 0.5) + (100 * 0.75) + (100 * 1.2) + ((units-250) * 1.5));
        } else {
            System.out.println("Invalid Input!");
        }

        total = (float) (total + (total * 0.2));        // additional surcharge of 20%
        System.out.println("Your Total bill = Rs." + total);
    }
}
