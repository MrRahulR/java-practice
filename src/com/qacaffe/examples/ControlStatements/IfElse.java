package com.qacaffe.examples.ControlStatements;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        //Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to test whether the given number is bigger than 20.");
        int number = scanner.nextInt();

        if (number > 20) {
            System.out.println("Congratulations !!! Number is bigger than 20.");
        } else {
            System.out.println("Sorry !!! The number which you entered is not bigger than 20, Please try again.");
        }

        System.out.println("Outside if - else block.");
    }
}

/*
Output
(when entered number is less than 20)
Please enter a number to test whether the given number is bigger than 20.
18
Sorry !!! The number which you entered is not bigger than 20, Please try again.
Outside if - else block.


(when entered number is greater than 20)
Please enter a number to test whether the given number is bigger than 20.
33
Congratulations !!! Number is bigger than 20.
Outside if - else block.
 */