package com.gunjana.Assignment.Basic_java;


import java.util.Scanner;

/** PROGRAM 07 : To calculate Fibonacci Series up to n numbers. **/
/* Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13 ... n ;
   starts from 0 and 1, 0+1 = 1 is the next number
   now 1+1 = 2
       1+2 = 3
       2+3 = 5
       3+5 = 8
       5+8 = 13
         ...
          n
*/

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, n, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = in.nextInt();
        for (int i = 0; i <= n; i++){
            System.out.print(a + " ");
            sum = a + b;
            a = b;             // REMEMBER : store the value of b in a before changing the value of b to sum
            b = sum;
        }
    }
}
