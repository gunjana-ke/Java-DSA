package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 13 : Write a function that returns all prime numbers between two given numbers.**/

public class Prime_no_between_2nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start;
        int end;
        System.out.print("Enter the starting number : ");
        start = in.nextInt();
        System.out.print("Enter the end number : ");
        end = in.nextInt();

        primes_betweenNums(start, end);

    }

    static void primes_betweenNums(int start, int end){
        System.out.println("Prime numbers from " + start + " to " + end + " are : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c < num){
            if (num % c == 0)
                return false;
            c++;
        }
        return c * c > num;
    }
}
