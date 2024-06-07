package com.gunjana.DsaJava.switch_statements;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee ID :");
        int EId = in.nextInt();

        switch (EId){
            case 1:
                System.out.println("Rahul");
                break;
            case 2:
                System.out.println("Rajesh");
                break;
            case 3:
                System.out.println("Rani");
                System.out.println("Enter Department : ");
                String dept = in.next();
                switch (dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Civil":
                        System.out.println("Civil Department");
                        break;
                    case "ECE":
                        System.out.println("ECE Department");
                        break;
                    default:
                        System.out.println("Invalid Department!");
                }
                break;
            default:
                System.out.println("Invalid ID!");
        }

        // ENHANCED SWITCH
        switch (EId) {
            case 1 -> System.out.println("Rahul");
            case 2 -> System.out.println("Rajesh");
            case 3 -> {
                System.out.println("Rani");
                System.out.println("Enter Department : ");
                String dept = in.next();
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Civil" -> System.out.println("Civil Department");
                    case "ECE" -> System.out.println("ECE Department");
                    default -> System.out.println("Invalid Department!");
                }
            }
            default -> System.out.println("Invalid ID!");
        }
    }
}
