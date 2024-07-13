package com.gunjana.DsaJava.Functions_methods;

public class Sum_overloading_Example {
    public static void main(String[] args) {
        int ans1 = sum(2, 8);
        int ans2 = sum(56, 98, 834);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }
}
