package com.gunjana.DsaJava.Functions_methods;

import java.util.Scanner;

/** SYNTAX :
     *          access modifier return_type name (arguments){
     *              //Body
     *              return statement
     *          }
 * **/


public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){      // static : does not require an object during the function call
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = in.nextInt();
        System.out.println("Enter number 2");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum = " + sum);
    }
}
