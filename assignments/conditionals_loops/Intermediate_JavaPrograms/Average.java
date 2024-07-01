package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 03 : Calculate the average of n numbers
 *  Average = (Sum of n numbers) / Total number of elements
 *  Ex : If n = 5
 *       Average = (1+2+3+4+5) / 5
 *
 * **/

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, i = 0, sum = 0;
        System.out.print("Enter the number : ");
        num = in.nextInt();

        if(num > 0){
            for (i = 0; i <= num; i++){
                sum = sum + i;
            }
        } else {
            System.out.println("Invalid Input!");
        }

        float avg = (sum/num);
        System.out.println("Average = " + avg);

        // APPROACH 2 (Where user enters each value)

        Scanner inp = new Scanner(System.in);
        int n = 1 , temp = 0, count = 0;        // n = 1  to enter the loop for inputs
        System.out.print("Enter the numbers (to stop enter 0) : ");

        while (n != 0){
            n = inp.nextInt();
            temp = temp + n;
            count ++;
        }
        float average = (temp / (count-1));            // (count-1) because 0 input is also considered
        System.out.println("Average = " + average);
    }


}
