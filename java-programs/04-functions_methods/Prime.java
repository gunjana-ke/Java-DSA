package com.gunjana.DsaJava.Functions_methods;

import java.util.Scanner;

/**   All your multiples will be until its square root
 *    Example : 36
 *              1 * 36
 *              2 * 18
 *              3 * 12
 *              4 * 9
 *            ---------
 *              6 * 6   -> (c * c) after this they keep repeating so if a number crosses this then it is a prime number
 *            ---------
 *              9 * 4
 *              12 * 3
 *              18 * 2
 *              36 * 1
 *      Check until the square root if there are no factors then it is a Prime number
 * **/

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        boolean prime = isPrime(num);
        if (prime) {
            System.out.println(num + " Is Prime");
        } else {
            System.out.println(num + " Is not Prime");
        }
    }

    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        int c = 2;                      // Starting from 2
        while (c * c <= num){           // checking till square root
            if (num % c == 0)           // if true then has factors so it is not prime
                return false;
            c++;
        }
        return c * c > num;             // if it crosses square root without factors then it is prime
    }
}
