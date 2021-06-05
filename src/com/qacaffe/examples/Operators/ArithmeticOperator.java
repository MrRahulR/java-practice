package com.qacaffe.examples.Operators;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {

        //Variable declaration section
        int a, b;

        //Scanner class object which is used to take input from the user.
        Scanner scanner = new Scanner(System.in);

        //Take value of "a" from the user.
        System.out.print("Enter value of a : ");
        a = scanner.nextInt();

        //Take value of "b" from the user.
        System.out.print("Enter value of b : ");
        b = scanner.nextInt();

        //Printing value of "a" and "b" which user entered.
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

        //Performing Arithmetic operation

        //Addition
        System.out.println("Addition of two numbers is : " + (a + b));

        //Subtraction
        System.out.println("Subtraction of two numbers is : " + (a - b));

        //Multiplication
        System.out.println("Multiplication of two numbers is : " + (a * b));

        //Division
        System.out.println("Division of two numbers is : " + (b / a));

        //Modulo
        System.out.println("Module of two numbers is : " + (b % a));
    }
}

/*
Output :
Enter value of a : 24
Enter value of b : 6
Value of a : 24
Value of b : 6
Addition of two numbers is : 30
Subtraction of two numbers is : 18
Multiplication of two numbers is : 144
Division of two numbers is : 0
Module of two numbers is : 6
*/
