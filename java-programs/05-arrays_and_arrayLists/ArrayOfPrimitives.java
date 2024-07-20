package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfPrimitives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 34;
        arr[1] = 44;
        arr[2] = 54;
        arr[3] = 64;
        arr[4] = 74;
        // arr[] = [34, 44, 54, 64, 74]
        System.out.println(arr[3]);

        // Input using for loop
        System.out.print("Enter the array elements : ");
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        // Printing an array
        for (int num : arr1) {  // for every element in the array, print the element
            System.out.println(num + " ");      // here num represents the elements of the array
        }

        //System.out.println(arr1[5]);   // index out of bound error

        System.out.println(Arrays.toString(arr));      // Converts array into a string and prints that string
    }
}
