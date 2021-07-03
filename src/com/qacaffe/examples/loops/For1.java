package com.qacaffe.examples.loops;

public class For1 {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello this is block " + counter++);
        }
    }
}

/*
Output:
Hello this is block 1
Hello this is block 2
Hello this is block 3
Hello this is block 4
Hello this is block 5
Hello this is block 6
Hello this is block 7
Hello this is block 8
Hello this is block 9
Hello this is block 10
 */