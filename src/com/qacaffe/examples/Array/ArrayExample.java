package com.qacaffe.examples.Array;

public class ArrayExample {
    public static void main(String[] args) {
        int[] anArray = new int[10];
        for (int i = 0; i < 10; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
    }
}

/*
Output :
0 1 2 3 4 5 6 7 8 9
 */