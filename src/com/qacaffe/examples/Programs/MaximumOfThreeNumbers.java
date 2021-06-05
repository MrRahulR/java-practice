package com.qacaffe.examples.Programs;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        //variable declaration
        int n1, n2, n3, maximum;

        //Input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        n1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        n2 = scanner.nextInt();
        System.out.print("Enter number 3 : ");
        n3 = scanner.nextInt();

        //Logic to check maximum of three numbers using conditional operators.
        maximum = n3 > (n1 > n2 ? n1 : n2) ? n3 : ((n1 > n2) ? n1 : n2);

        //Print statement.
        System.out.println("Maximum of three numbers is : " + maximum);
    }
}

/*
Output :
Enter number 1 : 15
Enter number 2 : 18
Enter number 3 : 13
Maximum of three numbers is : 18
 */