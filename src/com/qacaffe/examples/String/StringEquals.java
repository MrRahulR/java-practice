package com.qacaffe.examples.String;

public class StringEquals {

    public static void main(String[] args) {
        String string1 = "Hello ";
        String string2 = "hello ";
        String string3 = "Hello ";

        System.out.println(string1.equals(string2)); // returns false
        System.out.println(string1.equals(string3)); // returns true

    }
}

/*
Output :
false
true
*/
