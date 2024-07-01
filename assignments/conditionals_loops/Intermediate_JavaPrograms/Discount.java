package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 04 : Calculate the Discount.
 *  Take Total price and the discount percentage
 *  Discount = ((Total price) * (Discount percentage)) / 100
 *
 *  APPROACH 2 :
 *  For price less than 1000 -> 10% discount
 *  For price less than 2000 -> 15% discount
 *  For price less than 3000 -> 20% discount
 *  Anything above 3000      -> 25% discount
 * **/

public class Discount {
    public static void main(String[] args) {

        // APPROACH 1

        Scanner in = new Scanner(System.in);
        float price, discount;
        System.out.print("Enter total Price : ");
        price = in.nextFloat();
        System.out.print("Enter discount percentage : ");
        discount = in.nextFloat();
        float amount = (price - (price * discount) / 100);
        System.out.println("Your Total Bill : " + amount);

        // APPROACH 2

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Total Price : ");
        float amt = inp.nextFloat();
        float bill;

        if(amt < 1000) {
            bill = (amt - (amt * 10) / 100);       // Subtracting 10% from total price
        } else if (amt < 2000) {
            bill = (amt - (amt * 15) / 100);       // Subtracting 15% from total price
        } else if (amt < 3000) {
            bill = (amt - (amt * 20) / 100);       // Subtracting 20% from total price
        } else {
            bill = (amt - (amt * 25) / 100);       // Subtracting 25% from total price
        }
        System.out.println("Your Total Bill = " + bill);
    }
}
