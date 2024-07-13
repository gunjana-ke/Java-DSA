package com.gunjana.DsaJava.Functions_methods;

import java.util.Scanner;

public class Return_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = in.nextInt();
        System.out.println("Enter number 2");
        int b = in.nextInt();
        int sum1 = sum(a, b);
        System.out.println("Sum = " + sum1);
    }
    static int sum (int a, int b){
        int sum = a + b;
        return sum;         // Return indicates that this function block has ended
    //  System.out.println("This line will never execute");
    }
}
