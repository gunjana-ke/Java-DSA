package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declaration of multi-dimensional array list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initializing multi-dimensional array list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding Elements 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
