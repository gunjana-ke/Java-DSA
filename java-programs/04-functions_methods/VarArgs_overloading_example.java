package com.gunjana.DsaJava.Functions_methods;

import java.util.Arrays;

public class VarArgs_overloading_example {
    public static void main(String[] args) {
        args(34, 67, 1 , 689, 90);
        args("Raj", "Ram", "Rahul");
//        args();  ->  Creates ambiguity ; compiler will not know which function to execute.
    }

    static void args(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void args(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
