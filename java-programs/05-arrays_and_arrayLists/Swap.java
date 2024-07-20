package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before Swap : " + Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("After Swap : " + Arrays.toString(arr));
    }

    static void swap (int[] arr, int i1, int i2){
            int temp = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = temp;
    }
}
