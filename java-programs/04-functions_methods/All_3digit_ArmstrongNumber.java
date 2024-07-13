package com.gunjana.DsaJava.Functions_methods;

import java.util.Scanner;

public class All_3digit_ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int num){
        int temp = num;
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum += (rem * rem * rem);
            num = num / 10;
        }
        return sum == temp;
    }
}
