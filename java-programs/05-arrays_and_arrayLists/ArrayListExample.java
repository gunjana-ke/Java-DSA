package com.gunjana.DsaJava.Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/** ArrayList : When you do not know how much will be the size of the array and take any number of inputs
 *              then you use Array list.
 *
 *  Syntax :
 *          ArrayList<datatype> name = new ArrayList<>();       // cannot add primitives in data types
 *
 *          // Use wrapper classes such as Integer, String etc
 *
 * **/

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(3); //we can add number of elements more than the initialCapacity
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Search an element
        System.out.println("Element present? = " + list.contains(40));
        System.out.println("Element present? = " + list.contains(44));

        // Add an element to an index : updating
        System.out.println("Before update : " + list);
        System.out.println("Replacing element : " + list.set(2, 60));
        System.out.println("After update : " + list);

        // Remove an element from index
        System.out.println("Before removing an element: " + list);
        System.out.println("Removed : " + list.remove(0));
        System.out.println("Before removing an element: " + list);


        ArrayList<Integer> list1 = new ArrayList<>(5);

        // Taking input
        System.out.println("Enter the elements of the list : ");
        for (int i = 0; i < 5; i++) {
            list1.add(in.nextInt());
        }

        // Printing elements
        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
}
