package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;


import java.util.Scanner;

/** PROGRAM 22 : Perfect Number In Java **/

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= num/2 ; i++) {
            if (num % i == 0){
                sum = sum + i;
            }
        }
        if (sum == num){
            System.out.println(num + " Is a Perfect Number.");
        } else {
            System.out.println(num + " Is not a Perfect Number.");
        }
    }
}
