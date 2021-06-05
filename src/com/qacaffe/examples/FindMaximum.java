package com.qacaffe.examples;

import java.util.Scanner;

public class FindMaximum {

    public static void main(String[] args) {

        int n1, n2, n3, n4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1   ");
        n1 = scanner.nextInt();

        System.out.print("Enter Number 2   ");
        n2 = scanner.nextInt();

        System.out.print("Enter Number 3   ");
        n3 = scanner.nextInt();

        System.out.print("Enter Number 4   ");
        n4 = scanner.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                if (n1 > n4) {
                    System.out.println("The biggest number is   " + n1); //n1
                }
            }
        } else if (n2 > n3) {
            if (n2 > n4) {
                System.out.println("The biggest number is   " + n2); //n2
            }
        } else if (n3 > n4) {
            System.out.println("The biggest number is   " + n3); //n3
        } else {
            System.out.println("The biggest number is   " + n4); //n4
        }
    }
}

/*
Output :
Enter Number 1   20
Enter Number 2   26
Enter Number 3   17
Enter Number 4   19
The biggest number is   26

 */
