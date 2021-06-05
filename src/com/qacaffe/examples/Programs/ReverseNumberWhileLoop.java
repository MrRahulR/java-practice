package com.qacaffe.examples.Programs;

import java.util.Scanner;

public class ReverseNumberWhileLoop {
    public static void main(String[] args) {
        int num, reverse = 0, result; //declaring variable

        //Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to reverse.");
        num = scanner.nextInt();

        //Logic to reverse number using while loop.
        while (num != 0) {
            result = num % 10;
            reverse = reverse * 10 + result;
            num /= 10;
        }

        //Print Statement
        System.out.println("Reverse Number is : " + reverse);
    }
}

/*
Output :
Enter number to reverse.35131
Reverse Number is : 13153
 */