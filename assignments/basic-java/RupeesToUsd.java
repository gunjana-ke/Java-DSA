package com.gunjana.Assignment._02_FirstJava;

import java.util.Scanner;

/** PROGRAM 06 : Input currency in rupees and output in USD. **/

public class RupeesToUsd {
    public static void main(String[] args) {
        float rupees, usd;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the currency in Rupees : ");
        rupees = in.nextFloat();
        usd = rupees * 0.012f;                                  // 1 Rupee = 0.012 US Dollars
        System.out.println(rupees + " Rupees = " + usd);
    }
}
