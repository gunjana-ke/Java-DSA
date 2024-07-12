package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 21 : Java Program Vowel Or Consonant **/

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char x = in.next().trim().charAt(0);

        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            System.out.println("'" + x + "'" + " Is an Vowel.");
        } else {
            System.out.println("'" + x + "'" + " Is a Consonant.");
        }
    }
}
