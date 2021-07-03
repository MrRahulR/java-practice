package com.qacaffe.examples.ControlStatements;

public class SwitchExe1 {
    public static void main(String[] args) {

        char c = 'C';
        System.out.println("Example of switch statement in java.");

        switch (c) {
            case 'A':
                System.out.println("A is printed.");
                break;
            case 'B':
                System.out.println("B is printed.");
                break;
            case 'C':
                System.out.println("C is printed.");
                break;
            case 'D':
                System.out.println("D is printed.");
                break;
            default:
                System.out.println("Invalid Input !!! ");
        }
    }
}

/*
Output:
Example of switch statement in java.
C is printed.
 */