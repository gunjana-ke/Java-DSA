package com.gunjana.DsaJava.switch_statements;

import java.util.Scanner;

public class SwitchEnhanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1-7 : ");
        int day = in.nextInt();

        // Writing switch in an Enhanced format
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input!");
        }

        // Weekdays and Weekends
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Input!");
        }

        // Replacing with enhanced format
        switch (day) {
            case 1, 2, 3, 4, 5, 6 -> System.out.println("Weekday");
            case 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid Input!");
        }
    }
}
