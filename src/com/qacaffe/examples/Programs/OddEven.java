package com.qacaffe.examples.Programs;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        //Scanner class object is used to read input from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int value = scanner.nextInt();

        //Logic to check the given number is even or odd.
        if (value % 2 == 0) {
            System.out.println(value + " is even.");
        } else {
            System.out.println(value + " is odd.");
        }
    }
}

/*
Output :
Please enter a number : 15
15 is odd.
 */