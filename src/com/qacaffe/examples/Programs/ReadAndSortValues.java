package com.qacaffe.examples.Programs;

import java.util.Scanner;

public class ReadAndSortValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] value = new int[5];
        int count = 1, temp;

        //To take the number of marks entered by the users.
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Value " + count++ + ":      ");
            value[i] = scanner.nextInt();
        }

        //sorting
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] > value[j]) {
                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }

        System.out.println("\nValues entered by user are sorted in ascending order: ");
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }

    }
}

/*
Output :
Enter Value 1:      5
Enter Value 2:      6
Enter Value 3:      4
Enter Value 4:      1
Enter Value 5:      2

Values entered by user are sorted in ascending order:
1 2 4 5 6
 */
