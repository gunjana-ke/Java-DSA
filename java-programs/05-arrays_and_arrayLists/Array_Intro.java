package com.gunjana.DsaJava.Arrays_ArrayList;


/** ARRAY IS A COLLECTION OF ELEMENTS WITH SAME DATATYPE AND SAME NAME.
 *
 *  SYNTAX :
 *
 *      datatype[] variable_name = new datatype[size];
 *
 * **/

public class Array_Intro {
    public static void main(String[] args) {

        // Store 5 roll numbers
        int[] roll_no = new int[5];  // roll_no (reference variable) is pointing to an array object of type integer.

        // Direct initialization
        int[] rollnos = {10, 54, 87, 30};

        // DETAILED : Step by Step understanding

        int[] ros; // Declaration of array, ros is getting declared in the stack
        ros = new int[5];  // Actual memory creation - Initialization : object is created in the memory (heap)

        System.out.println(ros[0]);     // 0
        System.out.println(ros[2]);     //0

    }
}
