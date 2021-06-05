package com.qacaffe.examples;


/*
Ticket Calculator for a Concert

Instructions

  Each family can have one or more members.
  The price depends on the day of week and person for children and adults they have different pricing.
  Price list:
    o Week days (Monday to Thursday)
      Child:      15$
      Adult:      20$
    o Friday night
      Child:      25$
      Adult:      30$
    o Weekends (Saturday and Sunday)
      Child:      35$
      Adult:      40$

* */

import java.util.Scanner;

public class TicketCalculator {

    public static void main(String[] args) {

        //--------------------Variable Declaration Section-----------------
        int dayOfWeek, personCounter = 1, totalTicketPrice = 0, age;
        String anotherPerson = "y";


        //--------------------Program's Logic-------------------------------

        System.out.println("1: Mon 2: Tue 3: Wed \n" +
                "4: Thu 5: Fri 6: Sat \n" +
                "7: Sun \n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which day are we ? ");
        dayOfWeek = scanner.nextInt();

        while (anotherPerson.equalsIgnoreCase("y")) {
            System.out.print("How old is person " + personCounter++ + "?");
            age = scanner.nextInt();

            System.out.print("Another Person ?");
            anotherPerson = scanner.next();

            if ((dayOfWeek >= 1) && (dayOfWeek <= 4)) {
                if (age > 18) {
                    totalTicketPrice = totalTicketPrice + 20;
                } else {
                    totalTicketPrice = totalTicketPrice + 15;
                }
            } else if (dayOfWeek == 5) {
                if (age > 18) {
                    totalTicketPrice = totalTicketPrice + 30;
                } else {
                    totalTicketPrice = totalTicketPrice + 25;
                }
            } else if ((dayOfWeek == 6) || (dayOfWeek == 7)) {
                if (age > 18) {
                    totalTicketPrice = totalTicketPrice + 40;
                } else {
                    totalTicketPrice = totalTicketPrice + 35;
                }
            } else {
                System.out.println("Oops !!! You entered invalid day.");
            }
        }

        if (anotherPerson.equalsIgnoreCase("n")) {
            personCounter--;
            System.out.println("Person Count: " + personCounter);
            System.out.println("Total is: $" + totalTicketPrice);
        }
    }
}

/*
Output :

 */
