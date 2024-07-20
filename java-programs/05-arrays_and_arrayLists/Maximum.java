package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int r = 0; r < arr.length; r++) {
            arr[r] = in.nextInt();
        }
        System.out.println("Maximum element = " + max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
