package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int r = 0; r < arr.length; r++) {
            arr[r] = in.nextInt();
        }
        reverse(arr);
    }

    // 2 pointer method
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }

    static void swap (int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
