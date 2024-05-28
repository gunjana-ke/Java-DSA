package com.gunjana.Assignment.Conditionals_loops.Additional_Basics;

import java.util.Scanner;

// PROGRAM 23 : Input a number and print all the factors of that number (use loops).

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();

        System.out.println("Factors are : ");
        for (int i = 0; i <= n; i++){           // Outer For loop starts from 0 - n;
            for (int j = 0; j <= n; j++){       // Inner For loop starts from 0 - n;
                if (i*j == n)
                    System.out.print(i + " ");
            }
        }
    }
}

