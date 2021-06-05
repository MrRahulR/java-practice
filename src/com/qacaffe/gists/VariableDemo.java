package com.qacaffe.gists;

public class VariableDemo {
    public static void main(String[] args) {

        double profit, principle = 1000, interestRate = 0.0625; // it is possible to initialize at creation time
        int numOfYears = 5;

        // Calculate profit after the given number of years
        // Notice that until this point, profit is still uninitialized

        profit = principle * interestRate * numOfYears;
        System.out.println("The profit after " + numOfYears + " years is: " + profit + "$.");
    }
}

/*
Output : The profit after 5 years is: 312.5$
*/
