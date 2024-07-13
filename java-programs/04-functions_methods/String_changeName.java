package com.gunjana.DsaJava.Functions_methods;


/** STRINGS ARE IMMUTABLE (Cannot be changed)
 *  This is the reason why the changes made in the function does not affect the original value
 *  also it works the way explained in swap.java file
 * **/

public class String_changeName {
    public static void main(String[] args) {
        String name = "Kunal";

        changeName(name);
        System.out.println("Name : "  + name);

        /** Here,
         *   name -> Kunal
         *   naam -> Kunal
         * **/
    }

    static void changeName(String naam){
        naam = "Rahul";

        /**  Here,
         *      naam -> Rahul
         *      name -> Kunal
         *  So, This means that naam is not changing the value but
         *      It is creating a new object itself.
         * **/
    }
}
