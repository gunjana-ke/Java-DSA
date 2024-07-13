package com.gunjana.DsaJava.Functions_methods;

/*
    VARIABLE ARGUMENTS (VarArgs Methods):
            When you create a method that creates a variable number of arguments it is known as
            variable length arguments.
 */

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        random(20, 34, 3, 2, 6, 7);
        multiple(10, 20, "Raj", "Ram", "Rahul");
    }

    static void random(int ...v){       // Taking an array of integers
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...c){    // VarArgs Should always be last in the list
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
}
