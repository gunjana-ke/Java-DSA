package com.gunjana.DsaJava.Functions_methods;

/** Pass by value (There is no pass by reference in java)
 *  In Primitives : int, short, char - it just passes the value to the function
 *                                     so function creates a new object and points to the
 *                                     new object so the original value is not affected
 **/

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Original : " + a + " " + b);
        swap(a, b);
        System.out.println("Swapped : " + a + " " + b);  // VALUES NOT SWAPPED

        /** The values are not swapped because
              Here when function is called,
               a -> 10
               n1 -> 10   // Just the value is passed

               b -> 20
               n2 -> 20    // Just the value is passed
         **/
    }

    // Code to swap the values of two variables
    static void swap(int n1, int n2){

        int temp = n1;        // temp = 10
        n1 = n2;              // n1 = 20 Now n1 has created a new object here
        n2 = temp;            // n2 = 10 Now n2 has created a new object here


        /** Swapped : n1 = 20 ; b = 10
          This does not affect the function call
          Because,
                  In this function n1 and n2 has created a new object itself
                  so n1 and n2 (reference variables) are no more pointing to the same object.
                  it is pointing to as
                       n1 -> 20
                       n2 -> 10

                  But, In the calling function (in main() function) it is still pointing to as
                       a -> 10
                       b -> 20

                  Observe that 'n1' & 'n2' are not changing the value of 'a' & 'b'
                  but they are creating a new object itself in this scope.

                  So, as a new object is created original value of a and b
                  is not changed in the function call.
         **/
    }
}


