package com.qacaffe.examples.Programs;

import java.util.Scanner;

public class CalculatorExample {

    //Variable declaration
    public static double num1;
    public static double num2;
    public static char operation;
    public static double result;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input from user
        System.out.println("Enter num1 : ");
        num1 = scanner.nextDouble();

        System.out.println("Enter num2 : ");
        num2 = scanner.nextDouble();

        System.out.println("Select the operation which you want to perform from following given list of operations : \n " +
                "(+,-,*,/,%)");
        operation = scanner.next().charAt(0);

        //Logic to perform calculations using switch case.
        switch (operation) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            default:
                System.out.println("Invalid operator entered");
                break;
        }

        //print statement
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

    }
}

/*
Output :
Enter num1 :
15
Enter num2 :
20
Select the operation which you want to perform from following given list of operations :
 (+,-,*,/,%)
+
15.0 + 20.0 = 35.0
 */