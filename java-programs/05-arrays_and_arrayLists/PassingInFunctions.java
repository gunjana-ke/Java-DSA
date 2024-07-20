package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before : " + Arrays.toString(arr));
        change(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 0;
        arr[2] = 6;
    }
}
