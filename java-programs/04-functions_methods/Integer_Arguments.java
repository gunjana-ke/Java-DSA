package com.gunjana.DsaJava.Functions_methods;

import java.util.Scanner;

public class Integer_Arguments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int n1 = in.nextInt();
        System.out.print("Enter Second number : ");
        int n2 = in.nextInt();

        int sum = sum(n1, n2);      // Function call using arguments

        // OR when you are not taking input from the user
        // sum = sum (10, 20);

        System.out.println("Sum = " + sum);
    }

    // Pass the value of numbers when you are calling the method in main
    static int sum(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
}
