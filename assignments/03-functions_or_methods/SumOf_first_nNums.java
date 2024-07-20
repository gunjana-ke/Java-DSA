package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

public class SumOf_first_nNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int num = in.nextInt();

        System.out.println("Sum = " + sum(num));
    }

    static int sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        //sum = (n * (n + 1)) / 2;    Alternate approach using formula for sum of first 'n' numbers
        return sum;
    }
}
