package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

/** SYNTAX :
 *          datatype[][] array_name = new datatype[no_rows][no_columns];
 * **/

public class MultiDim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Different ways to initialize

        // First
        int[][] arr = new int[3][3];   // initializing row size is mandatory

        // Second
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Third
        int[][] arr2 = {
                {1, 2, 3},   //0 // We can initialize 2D array in this way also
                {4, 5},      //1 // This is why row size is mandatory while defining an array to create it in heap memory
                {6, 7, 8, 9} //2 // column size is not mandatory as you can even create these type of 2D arrays
        };

        /*
        *   arr2[2][1] -> 7
        *   arr2[1][1] -> 5
        *   arr2[0][2] -> 3
        *   arr2.length -> 3        number of rows
        *   arr2[0].length -> 3     number of columns in first row
        *   arr2[1].length -> 2     number of columns in second row
        *   arr2[2].length -> 4     number of columns in third row
        */

        // Taking input
        System.out.println("Enter the Multi Dimensional array : ");
        for (int row = 0; row < arr.length; row++) {            // arr.length returns number of rows in the array
            for (int col = 0; col < arr[row].length; col++) {   // Taking input for each row
                arr[row][col] = in.nextInt();                   // arr[row].length returns the number of elements or columns in each row
            }
        }

        /* Outer for loop : iterating each row
        *  Inner for loop : integrating column for each row
        */


        // Printing Multi Dimensional Array

        // using nested for loops
        System.out.println("Using nested for loop : ");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        // using toString()
        System.out.println("Using toString() method : ");
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString(arr[r]));
        }
    }
}
