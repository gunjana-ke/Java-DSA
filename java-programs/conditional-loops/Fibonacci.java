package com.gunjana.conditionals_loops;


// Solving Fibonacci series

import java.util.Scanner;

/** LOGIC : Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ... n
            Here the series starts  from 0, 1
            then the sum of the digits is the next digit => 0 + 1 = 1
            now the series is 0, 1, 1. the sum of the last two numbers is the next number
            1 + 1 = 2, so the series is 0, 1, 1, 2 .. this continues until n numbers
 **/

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.print(b);
    }
}
