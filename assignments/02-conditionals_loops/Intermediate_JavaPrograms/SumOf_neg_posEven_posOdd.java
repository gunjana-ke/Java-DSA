package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 26 : Write a program to print the sum of negative numbers,
 *  sum of positive even numbers and the sum of positive odd numbers
 *  from a list of numbers (N) entered by the user.
 *  The list terminates when the user enters a zero.
 *
 *  **/

public class SumOf_neg_posEven_posOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Numbers and to exit enter '0' : ");
        int num = in.nextInt();
        int sum_neg = 0;
        int sum_even = 0;
        int sum_odd = 0;


        while (num != 0){
            if(num < 0){
                sum_neg += num;
            }
            if (num > 0){
                if (num % 2 == 0){
                    sum_even += num;
                } else {
                    sum_odd += num;
                }
            }
            num = in.nextInt();
        }
        System.out.println("Sum of all Negative Numbers : " + sum_neg);
        System.out.println("Sum of all Positive Even Numbers : " + sum_even);
        System.out.println("Sum of all Positive Odd Numbers : " + sum_odd);
    }
}
