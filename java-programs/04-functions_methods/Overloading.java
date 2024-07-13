package com.gunjana.DsaJava.Functions_methods;

/*  OVERLOADING : When 2 or more functions have same name
*                 But with Different arguments
*                          > Number of arguments has to be different ; or
*                          > Type of arguments has to be different.
*               : Which function to run is determined during COMPILE TIME
*                 according to the function call.
*                 The argument values in the function call tells the compiler which function to run
* */

public class Overloading {
    public static void main(String[] args) {
        random(34);
        random("Ram");
    }

    static void random(int a){
        System.out.println(a);
    }

    static void random(String name){
        System.out.println(name);
    }
}

