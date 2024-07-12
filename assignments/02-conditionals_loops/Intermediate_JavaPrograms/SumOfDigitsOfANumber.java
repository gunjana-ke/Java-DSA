package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;


import java.util.Scanner;

/** PROGRAM 24 : Sum Of A Digits Of Number
 *  Example : num = 234
 *            sum = 9
 *          : num = 589
 *            sum = 22
 *          : num = 16
 *            sum = 7
 * **/

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int sum = 0, rem;

        while (num > 0){
            rem = num % 10;
            num /= 10;
            sum += rem;
        }
        System.out.println("Sum = " + sum);
    }
}
