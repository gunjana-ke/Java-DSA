package com.gunjana.Assignment._02_FirstJava;


import java.util.Scanner;

/** PROGRAM 09 : To find Armstrong Number between two given number. **/
// FOR ANY NUMBER OF DIGITS

    /**
     Logic : if number is 370
            > Here the number of digits is 3
            > So take the cube of each number and add them
            > (3*3*3) + (7*7*7) + (0*0*0) = 370  // Thus it is an Armstrong number

            if the number is 8208
            > Here the number of digits is 4
            > So multiply each number by 4 times and sum them up
            > (8*8*8) + (2*2*2) + (0*0*0) + (8*8*8) = 8208      //Thus it is an Armstrong Number


     first check how many digits the number is having,
     and then we have to send it to the power of each of its digit,
     and make the sum of that number and check it whether it is equal to that number
     **/

public class Armstrong {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = in.nextInt();
        int temp1 = num, temp2 = num;
        int digits = 0;
        int r, sum = 0;

        while (temp2 > 0){          // Find the number of digits
            digits++;
            temp2 /= 10;            // Removes the last digit from the number
        }
        System.out.println("Number of digits : " +  digits);
        while (num > 0){
            r = num % 10;
            num = num /10;
            sum = (int) (sum + Math.pow(r, digits));
        }
        if (sum == temp1){
            System.out.println(temp1 + " Is an Armstrong Number");
        } else {
            System.out.println(temp1 + " Is not an Armstrong Number");
        }
    }
}
