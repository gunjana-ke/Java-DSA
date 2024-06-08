package com.gunjana.conditionals_loops;

// Program to find the largest of 3 numbers

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        //APPROACH 01

        int a,b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Three numbers : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a > b){
            if (a > c)
                System.out.println("Largest = " + a); 
            else if (c > b)
                System.out.println("Largest = " + c);
        } else if (b > c) {
            System.out.println("Largest = " + b);
        } else
            System.out.println("largest = " + c);

        // APPROACH 2

        int x,y,z;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Three numbers : ");
        x = inp.nextInt();
        y = inp.nextInt();
        z = inp.nextInt();

        int max = x;        // Assuming x to be the maximum
        if(y > max){
            max = y;        // If y is greater than x then y becomes max
        }
        if (z > max){
            max = z;        // If z is greater than y then z becomes max
        }

        System.out.println("Largest = " + max);

        // APPROACH 03

        int p,q,r;
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter Three numbers : ");
        p = inpt.nextInt();
        q = inpt.nextInt();
        r = inpt.nextInt();

        max = Math.max(r, Math.max(p,q));       // The function returns the largest of two numbers
        System.out.println("Largest = " + max);
    }
}
