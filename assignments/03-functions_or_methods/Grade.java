package com.gunjana.Assignment.Functions_methods;

import java.util.Scanner;

/** PROGRAM 08 : Write a program that will ask the user to enter his/her marks (out of 100).
*                Define a method that will display grades according to the marks entered as below:
 *              Marks        Grade
 *              91-100         AA
 *              81-90          AB
 *              71-80          BB
 *              61-70          BC
 *              51-60          CD
 *              41-50          DD
 *              <=40          Fail
 * Refer : https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html
 * **/

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks and '0' when done : ");
        int marks = in.nextInt();
        grade(marks);
    }

    static void grade (int marks){
        if (marks >= 91 && marks <= 100){
            System.out.println("Grade : AA");
        } else if (marks >= 81 && marks <= 90){
            System.out.println("Grade : AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade : BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade : BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade : BC");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade : BC");
        } else {
            System.out.println("Fail");
        }
    }
}
