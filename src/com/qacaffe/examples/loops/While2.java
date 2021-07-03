package com.qacaffe.examples.loops;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {

        int payRatePerHour = 20;
        int maxHours = 40;
        double totalHoursWorked;
        String cont;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your work hours");
        totalHoursWorked = scanner.nextDouble();

        //Logic to validate input
        while ((totalHoursWorked < 1) || (totalHoursWorked > maxHours)) {
            System.out.println("Invalid entry!!! Your hours must be between 1 and 40.Do you want to continue?");
            System.out.println("Press 'y' to continue and 'n' to quit.");
            cont = scanner.next();
            if (cont.equalsIgnoreCase("y")) {
                System.out.println("Enter number of hours you worked for this week.");
                totalHoursWorked = scanner.nextDouble();
            } else {
                if (cont.equalsIgnoreCase("n")) {
                    System.exit(0);
                    System.out.println("Thank you for using Employee salary calculation system.");
                }
            }
        }

        //Calculation of gross salary.
        double salary = payRatePerHour * totalHoursWorked;
        System.out.println("Your salary for this week is $" + salary);
    }
}

/*
Output:
Enter your work hours
40
Your salary for this week is $800.0
 */