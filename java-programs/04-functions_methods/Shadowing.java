package com.gunjana.DsaJava.Functions_methods;

// Shadowing is for class variables not for methods

public class Shadowing {
    static int x = 485;      //This will be SHADOWED in line  12
    // Static because, we cannot use object dependent things in object independent things
    // anything outside the main function use static
    static int y = 90;
    public static void main(String[] args) {
        System.out.println(x);      //485
        int x = 595;            // Class variable at line 4 is SHADOWED here
        System.out.println(x);      //595

        int y;
        // System.out.println(y); Error : not initialized
        y = 80;  // scope will begin when the value is initialized
        random();
    }

    static void random(){
        System.out.println(x);
    }
}
