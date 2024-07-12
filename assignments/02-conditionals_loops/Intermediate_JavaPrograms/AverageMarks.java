package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 12 : Calculate Average Marks **/

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int n = in.nextInt();
        int i = 1;
        float sum = 0;
        System.out.println("Enter marks of each subject ");
        while (i != n+1){
            System.out.print("Subject " + i + " : ");
            sum = sum + in.nextInt();
            i++;
        }
        float AvgMarks = sum / n;
        System.out.println("Average Marks = " + AvgMarks);
    }
}
