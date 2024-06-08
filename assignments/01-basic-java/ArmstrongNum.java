package com.gunjana.Assignment._02_FirstJava;


import java.util.Scanner;

/** PROGRAM 09 : To find Armstrong Number between two given number. **/
// FOR 3 DIGITS

public class ArmstrongNum {
    public static void main(String[] args) {
            int num;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a ");
            num = in.nextInt();
            int temp = num;    // To not lose the original value of num, we can compare this with the resultant sum
            int r, sum = 0;

            while (num > 0){
                r = num % 10;           // Will give the unit digit of the number
                num = num /10;          // Will give the number by eliminating the unit digit
                sum = sum + (r*r*r);
            }
            if (sum == temp){
                System.out.println(temp + " Is an Armstrong Number");
            } else {
                System.out.println(temp + " Is not an Armstrong Number");
            }
        }
}

