package com.gunjana.DsaJava.Functions_methods;

/* SCOPE : Basically,
            Anything that is outside   IS   accessible inside,
            Anything that is inside  IS NOT accessible outside.
 */


public class Scope {
    public static void main(String[] args) {
        int a = 10;
        String name = "Kunal";
        {
            /* BLOCK SCOPE

            int a = 100; Error : a is already initialized
            -> Rule 1 : You can use and manipulate anything that is initialized outside
                        the block but, you cannot initialize the same variable again in the block scope
            */

            a = 100;
            System.out.println(a);      // a = 100

            int c = 50;
            // Now c is restricted to this block scope. It CANNOT be accessed outside the block scope
            /*
            -> Rule 2 :  Anything initialized in the block scope is bot accessible outside this block
            */
            name = "Raj";
            System.out.println(name);       // name : Raj
        }

        System.out.println(a);      // a = 100
        System.out.println(name);       // name : Raj
        // System.out.println(c);  Error : c is not initialized (Block scope is not accessible)
        /*
                System.out.println(num);
                System.out.println(marks);
                (Function Scope is not accessible here)
        */


        // LOOP SCOPE
        for (int i = 0; i < 10; i++) {
            System.out.println(i);          // 'i' is only accessible in this loop scope
            a = i;                          // a is outside the loop scope so it is accessible
        }
        //System.out.println(i);    Error: 'i' is not accessible out of the loop scope.

    }


    static void random (int marks)
    {
        // FUNCTION SCOPE

        int num = 80;
        System.out.println(num);
        System.out.println(marks);
    }




}
