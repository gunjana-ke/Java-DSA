package com.gunjana.conditionals_loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
            Syntax of for loops:

            for (initialization; condition; incriment/decrement) {
                //body
            }
        */
        for(int num = 1; num <= 10; num++){     //Prints number from 1-10
            System.out.println(num);            //num++ can also be written as (num += 1)
        }

        // Print numbers from 1-n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            System.out.println("Hello World!");  //prints hello world n times beside every number
        }
    }
}
