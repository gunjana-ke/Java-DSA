package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;


import java.util.Scanner;

/** PROGRAM 23 : Check Leap Year Or Not
 *  Detailed Reference : https://www.geeksforgeeks.org/program-check-given-year-leap-year/
 *
 *  A year is a leap year if the following conditions are satisfied:
 *      -> The year is multiple of 400.
 *      -> The year is a multiple of 4 and not a multiple of 100.
 *
 * **/

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " Is a Leap Year.");
        } else {
            System.out.println(year + " Is not a Leap Year.");
        }
    }
}
