package com.qacaffe.examples.ControlStatements;

import java.util.Scanner;

public class IfCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to test whether the given number is bigger than 20.");
        int number = scanner.nextInt();

        if (number > 20) {
            System.out.println("Congratulations!!! Number is bigger than 20.");
        }
        System.out.println("Outside if block.");
    }
}

/*
Output :
Please enter a number to test whether the given number is bigger than 20.
5
Outside if block.
 */
