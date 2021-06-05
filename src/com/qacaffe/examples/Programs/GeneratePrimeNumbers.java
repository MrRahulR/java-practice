package com.qacaffe.examples.Programs;

import java.util.Scanner;

public class GeneratePrimeNumbers {
    public static void main(String[] args) {
        int n, status = 1, num = 3, comma = 0;

        //Input value of n from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the value of n : ");

        //entered value is stored in variable n
        n = scanner.nextInt();

        //Logic to check prime number
        if (n >= 1) {

            System.out.println("First " + n + " prime numbers are:");

            System.out.print(2); // 2 is prime number
        }

        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print("," + num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}

/*
Output :
Please enter the value of n : 7
First 7 prime numbers are:
2,3,5,7,11,13,17
 */
