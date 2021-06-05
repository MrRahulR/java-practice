package com.qacaffe.examples;

import java.util.Scanner;

public class RelationalOperator {

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

        //Relational Operators

        //checks equals to
        System.out.println("A is equal B : " + (a == b));

        //checks not equals to
        System.out.println("A is not equal B : " + (a != b));

        //checks greater than
        System.out.println("A is greater than B : " + (a > b));

        //checks less than
        System.out.println("A is less than B : " + (a < b));

        //checks greater than equals to
        System.out.println("A is greater than or equal to B : " + (a >= b));

        //checks less than equals to
        System.out.println("A is less than or equal to B : " + (a <= b)); // true
    }
}

/*
Output :
Enter value of a : 25
Enter value of b : 5
Value of a : 25
Value of b : 5
A is equal B : false
A is not equal B : true
A is greater than B : true
A is less than B : false
A is greater than or equal to B : true
A is less than or equal to B : false
*/
