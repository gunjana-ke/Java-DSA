package com.gunjana.DsaJava.Functions_methods;

import java.util.Arrays;

/** In Classes, Objects, arrays etc. : Here a copy of the reference variable
 *                                     is  passed to the method.
 *                                     Thus, it does not create a new variable rather
 *                                     it changes the value of the copy sent to the method
 * **/

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 11, 22};

        changeValue(arr);       // When function is called arr = {1, 3, 5, 7, 11, 13}
        System.out.println(Arrays.toString(arr));   // arr Gets Changed.
    }

    static void changeValue(int[] num){     // num = {1, 3, 5, 7, 11, 22}
        num[5] = 13;                        // num = {1, 3, 5, 7, 11, 13}
    }
}
