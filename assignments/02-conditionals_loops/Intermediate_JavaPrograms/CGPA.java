package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 10 : Calculate CGPA Java Program
 *  TO calculate CGPA (Cumulative Grade Point Average)
 *  -> Take the total marks of each subject
 *  -> Divide each by 10 (We need arrays to do this, so I have  multiplied the denominator by 10)
 *  -> Take the sum of them
 *  -> divide the sum by total number of subjects
 *  -> At last to calculate CGPA PERCENTAGE we multiply the CGPA by 9.5
 *      CgpaPercentage = Cgpa * 9.5
 * **/
public class CGPA {
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
        float Cgpa = sum / (n * 10);    /* As we need arrays to divide each subject marks by 10
                                           multiplied denominator by 10 */
        float CgpaPercentage = (float) (Cgpa * 9.5);
        System.out.println("Total marks : " + sum);
        System.out.println("CGPA : " + Cgpa);
        System.out.println("Cgpa Percentage : " + CgpaPercentage);
    }
}
