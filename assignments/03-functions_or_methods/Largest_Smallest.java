package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 1 : Find the LARGEST and SMALLEST of THREE numbers **/

// APPROACH 1

public class Largest_Smallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int min = min(a, b, c);
        int max = max(a, b, c);
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);
    }

    static int min(int a, int b, int c){
        int min;
        if (a < b){
            if(a < c)
                min = a;
            else if (b < c)
                min = b;
            else
                min = c;
        } else if (b < c) {
            min = b;
        } else
            min = c;

        return min;
    }

    static int max(int a, int b, int c){
        int max;
        if(a > b){
            if(a > c){
                max = a;
            } else if (b > c)
                max = b;
              else
                max = c;
        } else if (b > c){
            max = b;
        } else
            max = c;

        return max;
    }
}
