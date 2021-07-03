package com.qacaffe.examples.loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from where you want to print digits in reverse order : ");
        int digit = scanner.nextInt();
        do {
            System.out.println(digit);
            digit--;
        } while (digit >= 1);
    }
}

/*
Output:
Enter a number from where you want to print digits in reverse order : 5
5
4
3
2
1
 */