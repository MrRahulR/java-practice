package com.qacaffe.examples.Programs;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {

        int num, reverse = 0; //declaring variable

        //Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to reverse.");
        num = scanner.nextInt();

        //Logic to reverse number using while loop.
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        //Print Statement
        System.out.println("Reverse Number is : " + reverse);
    }
}

/*
Output :
Enter number to reverse. 25536
Reverse Number is : 63552
 */