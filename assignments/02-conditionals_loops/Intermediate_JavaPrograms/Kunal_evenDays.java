package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 25 : Kunal is allowed to go out with his friends
 *  only on the even days of a given month.
 *  Write a program to count the number of days he can go out in the month of August.
 *
 *  Logic : August has 31 days
 *          even numbers of days = days / 2
 *          Example : 31 days
 *                    even = 31 / 2 = 15 days
 *                  : 30 days
 *                    even = 30 / 2 = 15 days
 *                  : 28 days
 *                    even = 28 / 2 = 14 days
 *                  : 29 days
 *                    even = 29 / 2 = 14 days
 * **/

public class Kunal_evenDays {
    public static void main(String[] args) {
        // For August
        int even_days = 31 / 2;
        System.out.println("Kunal is allowed to go for " + even_days + " in August");
    }
}
