package com.qacaffe.examples;

import java.util.Scanner;

public class IncDecOperator {
    public static void main(String[] args) {
        int a;

        //Scanner class object which is used to take input from the user.
        Scanner scanner = new Scanner(System.in);

        //Take value of "a" from the user.
        System.out.print("Enter value of a : ");
        a = scanner.nextInt();

        System.out.println("Value of a : " + a);
        System.out.println("Increment after performing ++a is  " + ++a);
        System.out.println("Increment after performing a++ is  " + a++);
        System.out.println("Decrement after performing --a is  " + --a);
        System.out.println("Decrement after performing a-- is  " + a--);
    }
}

/*
Output :
Enter value of a : 10
Value of a : 10
Increment after performing ++a is  11
Increment after performing a++ is  11
Decrement after performing --a is  11
Decrement after performing a-- is  11
*/
