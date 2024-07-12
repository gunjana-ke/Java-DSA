package com.gunjana.Assignment.Conditionals_loops.IntermediatePrograms;

import java.util.Scanner;

/** PROGRAM 09 : Calculate the Batting Average
 *  GFG Explanation : "https://www.geeksforgeeks.org/find-the-batting-average-of-a-batsman/"
 *  Consider 3 integers
 *  runs -> Total number of runs scored
 *  innings -> Number of innings played
 *  not_out -> Number of innings player remained not out
 *
 *  number of dismissals = number of innings - number of innings he remained not_out
 *  If the batsman was never dismissed, print “NA” as the no average can be defined.
 *
 *  batting average = runs / dismissals;
 * **/

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int runs, innings, not_out, battingAvg;
        System.out.print("Enter the total number of runs scored by the player : ");
        runs = in.nextInt();
        System.out.print("Enter the total number of innings played : ");
        innings = in.nextInt();
        System.out.print("Enter the number of times the player remained not out : ");
        not_out = in.nextInt();

        int out = innings - not_out;

        if(out == 0) {
            System.out.println("NA");
        } else {
            battingAvg = runs / out;
            System.out.println("Batting average = " + battingAvg);
        }
    }
}
