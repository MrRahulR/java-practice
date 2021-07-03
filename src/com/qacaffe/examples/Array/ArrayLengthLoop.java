package com.qacaffe.examples.Array;

import java.util.Scanner;

public class ArrayLengthLoop {

    public static void main(String[] args) {

        //-------------------Variable Declaration Section----------------------------
        int arraySize, arrayElements;

        //-------------------Program's Logic------------------------------------------

        //Input array size from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        arraySize = scanner.nextInt();

        //creating an array by taking the size of input from user.
        int[] newArray = new int[arraySize];

        //Input the array elements using for loop.
        System.out.println("Enter the array elements : ");
        for (arrayElements = 0; arrayElements < arraySize; arrayElements++) {

            //System.out.print("Element " + counter++ + ":    ");
            newArray[arrayElements] = scanner.nextInt();
        }

        //Logic to print the array elements.
        System.out.println("Added Array elements");
        System.out.print("[");
        for (arrayElements = 0; arrayElements < arraySize; arrayElements++) {
            System.out.print(newArray[arrayElements] + " ");
        }
        System.out.print("]");
    }
}

/*
Output :
Enter the array size : 5
Enter the array elements :
10
20
30
40
50
Added Array elements
[10 20 30 40 50 ]

 */
