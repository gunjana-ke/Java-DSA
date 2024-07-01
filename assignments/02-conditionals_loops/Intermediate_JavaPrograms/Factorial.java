package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 01 : FACTORIAL!
 *  Multiples all the numbers until the given number
 *  Ex : Factorial of 5
 *      5! = 5 * 4 * 3 * 2 * 1 = 120
 *      4! = 4 * 3 * 2 * 1 = 24
 *      And Always 0! = 1
 *                 1! = 1
**/

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter a number : ");
        num = in.nextInt();
        if(num == 0 || num == 1){
            fact = 1;
        } else {
            for (int i=1; i <= num; i++){
                fact = fact * i;
            }
        }
        System.out.println("Factorial = " + fact);

        //APPROACH 2 (wile-loop)

        Scanner inp = new Scanner(System.in);
        int n, factorial = 1, j = 2;
        System.out.print("Enter a number : ");
        n = inp.nextInt();
        if(n == 0 || n == 1){
            factorial = 1;
        } else {
            while (j <= n){
                factorial = factorial * j;
                j++;
            }
        }
        System.out.println("Factorial = " + factorial);
    }
    
}