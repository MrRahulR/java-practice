package com.qacaffe.examples.Operators;

public class LogicalOperator {
    public static void main(String[] args) {

        //Variable Declaration
        int a = 1;
        int b = 2;

        //Logical Operators
        System.out.println("a is 1 AND b is 2, therefore it is  " + ((a == 1) && (b == 1)));
        //false because value of b is 2 not 1

        System.out.println("a is 1 OR b is 1 therefore it is  " + ((a == 1) || (b == 1)));
        //true because one value is true

        System.out.println("a is not equal to b is " + (a != b));
        //true because a is not equal to b
    }
}

/*
Output :
a is 1 AND b is 2, therefore it is  false
a is 1 OR b is 1 therefore it is  true
a is not equal to b is true
*/
