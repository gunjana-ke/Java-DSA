package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 03 : A person is eligible to vote if his/her age is greater than or equal to 18.
 *               Define a method to find out if he/she is eligible to vote.
 *  Refer : https://www.efaculty.in/java-programs/voting-age-program-in-java/
 **/

public class VotingAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = in.nextInt();

        if (eligible(age))
            System.out.println("Eligible to Vote.");
        else
            System.out.println("Not Eligible to Vote.");
    }

    static boolean eligible(int age){
        if (age >= 18)
            return true;
        else
            return false;
    }
}
