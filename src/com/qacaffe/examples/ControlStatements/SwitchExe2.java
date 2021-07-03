package com.qacaffe.examples.ControlStatements;

import java.util.Scanner;

public class SwitchExe2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day : ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is Sunday.");
                break;
            case 2:
                System.out.println("Today is Monday.");
                break;
            case 3:
                System.out.println("Today is Tuesday.");
                break;
            case 4:
                System.out.println("Today is Wednesday.");
                break;
            case 5:
                System.out.println("Today is Thursday.");
                break;
            case 6:
                System.out.println("Today is Friday.");
                break;
            case 7:
                System.out.println("Today is Saturday.");
                break;
            default:
                System.out.println("Invalid Input !!! ");
        }
    }
}

/*
Output :
Enter day : 5
Today is Thursday.

 */