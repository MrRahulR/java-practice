package com.qacaffe.examples.ControlStatements;

public class SwitchExe3 {
    public static void main(String[] args) {

        String programName = "Computer Software Testing";
        int block = 2;

        switch (block) {
            case 1:
                System.out.println("You have selected algorithms and operating systems.");
                break;
            case 2:
                switch (programName) {
                    case "Computer Software Testing":
                        System.out.println("You have selected linux and introduction to object oriented programming.");
                        break;

                    case "Mobile Application Development":
                        System.out.println("You have selected kotlin and ios development.");
                        break;

                    case "Cyber Security":
                        System.out.println("You have selected unix and penetration testing.");
                        break;

                    default:
                        System.out.println("You have selected to learn Selenium and Rest Assured APIs.");
                }
        }
    }
}

/*
Output:
You have selected linux and introduction to object oriented programming.
 */