package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.Scanner;

public class MaxInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the array elements : ");
        for (int r = 0; r < arr.length; r++) {
            arr[r] = in.nextInt();
        }
        System.out.println("Enter the range starting index : ");
        int start = in.nextInt();
        System.out.println("Enter the range ending index : ");
        int end = in.nextInt();

        System.out.println("Maximum element = " + max(arr, start, end));
    }

    static int max(int[] arr, int start, int end){
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
