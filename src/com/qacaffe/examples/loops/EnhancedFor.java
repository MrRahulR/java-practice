package com.qacaffe.examples.loops;

public class EnhancedFor {
    public static void main(String[] args) {
        System.out.println("Example of enhanced for Loop.");
        String[] fruits = {"Mango", "Banana", "Kiwi", "Apples"};
        for (String elements : fruits) {
            System.out.println(elements);
        }
    }
}

/*
Output:
Example of enhanced for Loop.
Mango
Banana
Kiwi
Apples
 */