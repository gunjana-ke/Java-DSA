package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;
/** PROGRAM 16 : Reverse A String In Java **/


public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String orgStr = in.next();
        String revStr = "";
        for (int i = 0; i < orgStr.length(); i++) {
            revStr = orgStr.charAt(i) + revStr;
        }
        System.out.println("Original String : " + orgStr);
        System.out.println("Reverse String : " + revStr);
    }
}
