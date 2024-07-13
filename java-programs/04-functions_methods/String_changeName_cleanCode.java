package com.gunjana.DsaJava.Functions_methods;

public class String_changeName_cleanCode {
    public static void main(String[] args) {
        String name = "Kunal";

        changeName(name);
        System.out.println("Name : " + name);
    }

    static void changeName(String naam) {
        naam = "Rahul";
    }
}
