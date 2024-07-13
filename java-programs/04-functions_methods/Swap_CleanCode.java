package com.gunjana.DsaJava.Functions_methods;

public class Swap_CleanCode {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;

            System.out.println("Original : " + a + " " + b);
            swap(a, b);
            System.out.println("Swapped : " + a + " " + b);
        }
        static void swap(int n1, int n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
}
