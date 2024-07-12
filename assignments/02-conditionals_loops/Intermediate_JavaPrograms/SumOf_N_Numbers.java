package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 12 : Sum Of N Numbers **/

public class SumOf_N_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers and '0' to exit : ");
        int num = 1, i = 1, sum = 0;
        while(num != 0){
            num = in.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum : " + sum);
    }
}
