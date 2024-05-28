package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// LEETCODE(1) PROGRAM 22 : Subtract the Product and Sum of Digits of an Integer
// LINK : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int rem, mul = 1, sum = 0;
        while(n >= 1 && n <= Math.pow(10, 5) ){
            rem = n % 10;
            mul = mul * rem;
            sum = sum + rem;
            n = n / 10;
        }
        int diff = mul - sum;
        System.out.println("Sum = " + diff);
    }
}

//  FOR LEETCODE SOLUTION

class Solution {
    public int subtractProductAndSum(int n) {
        int rem, mul = 1, sum = 0;
        while(n >= 1 && n <= Math.pow(10, 5) ){
            rem = n % 10;
            mul = mul * rem;
            sum = sum + rem;
            n = n / 10;
        }
        int diff = mul - sum;
        return diff;
    }
}
