package com.qacaffe.examples.Array;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("Please enter 2 integers in existing array.");
        b[3] = scanner.nextInt();
        b[4] = scanner.nextInt();
        a = b;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        scanner.close();
    }
}

/*
Output :
Please enter 2 integers in existing array.
4
5
1
2
3
4
5
 */