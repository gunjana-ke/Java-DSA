package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 14 : Armstrong Number In Java
 *       Logic : if number is 370
 *             > Here the number of digits is 3
 *             > So take the cube of each number and add them
 *             > (3*3*3) + (7*7*7) + (0*0*0) = 370  // Thus it is an Armstrong number
 *
 *             if the number is 8208
 *             > Here the number of digits is 4
 *             > So multiply each number by 4 times and sum them up
 *             > (8*8*8*8) + (2*2*2*2) + (0*0*0*0) + (8*8*8*8) = 8208      //Thus it is an Armstrong Number
 *
 *
 *      first check how many digits the number is having,
 *      and then we have to send it to the power of each of its digit,
 *      and make the sum of that number and check it whether it is equal to that number
 * **/

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int dig = 0 , temp1 = num, temp2 = num, r;
        float sum = 0;
        while (temp2 != 0) {
            dig++;
            temp2 = temp2 / 10;     // Removes the last digit
        }

        while (num != 0){
            r = num % 10;
            num = num / 10;
            sum = (float) (sum + Math.pow(r, dig));
        }

        if(sum == temp1){
            System.out.println(temp1 + " Is an Armstrong Number");
        } else {
            System.out.println(temp1 + " Is not an Armstrong Number.");
        }
    }
}
