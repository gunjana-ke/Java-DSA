package com.gunjana.DsaJava.Functions_methods;

public class StringExample {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet(){      // This function has to return a Sting
        String greeting = "Hey! How are you?";
        return greeting;
    }

}
