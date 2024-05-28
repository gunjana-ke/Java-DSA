package com.gunjana.conditionals_loops;


// Program to find the number of times a number has occured

import java.util.Scanner;

public class Counting_occerences {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = in.nextInt();
        System.out.print("Enter the digit to count : ");
        int dig = in.nextInt();
        int temp = num;

        int count = 0;
        while(num > 0){
            int rem = num % 10;         // Provides the unit digit of the number
            if(rem == dig)
                count++;
            num = num/10;               // Provides the number after removing the unit digit
        }
        System.out.println("The number " + dig + " Has occured " + count + " number of Times");
    }
}
