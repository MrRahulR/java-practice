package com.qacaffe.examples.loops;

public class DoWhile3 {

    public static void main(String[] args) {

        //Variable declaration section
        String array1[] = {"Mike", "Jason", "Leonard", "Shane"};
        int array2[] = {1, 3, 4, 5, 7, 9};
        int count = 0, c2 = 0;

        //do while loop logic for accessing string elements from the array
        System.out.println("-----Printing String array elements : ");
        do {
            System.out.println(array1[count]);
            count++;
        } while (count < array1.length);

        //do while loop logic for accessing integer elements from the array
        System.out.println("-----Printing Integer array elements : ");
        do {
            System.out.println(array2[c2]);
            c2++;
        } while (c2 < array1.length);
    }
}

/*
Output:
-----Printing String array elements :
Mike
Jason
Leonard
Shane
-----Printing Integer array elements :
1
3
4
5

 */