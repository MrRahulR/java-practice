package com.qacaffe.examples.loops;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number whose multiplication Table you want : ");
        int multiplication = scanner.nextInt();

        System.out.println("------------Multiplication Table of " + multiplication + "------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", multiplication, i, multiplication * i);
        }
        System.out.println("------------Thanks for using our Multiplication Table System!!!------------");
    }
}

/*
Output:
Enter a number whose multiplication Table you want : 5
------------Multiplication Table of 5------------
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
------------Thanks for using our Multiplication Table System!!!------------

 */