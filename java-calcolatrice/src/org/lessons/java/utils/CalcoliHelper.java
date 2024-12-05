package org.lessons.java.utils;

// Class Definition

public class CalcoliHelper {

    // CalcoliHelper Methods
    
    public static int sum(int num1, int num2) {

        return num1 + num2;

    }

    public static double sum(double num1, double num2) {

        return num1 + num2;

    }

    public static int subtract(int num1, int num2) {

        return num1 - num2;

    }

    public static double subtract(double num1, double num2) {

        return num1 - num2;

    }

    public static int multiply(int num1, int num2) {

        return num1 * num2;

    }

    public static double multiply(double num1, double num2) {

        return num1 * num2;

    }

    public static String calculateMin(int num1, int num2) {

        String smallestNum = "These numbers are equal!";

        if (num1 > num2) {
            smallestNum = "The smallest number is: " + num2;
        } else if (num1 < num2) {
            smallestNum = "The smallest number is: " + num1;
        }
        
        return smallestNum;

    }

    public static String calculateMin(double num1, double num2) {

        String smallestNum = "These numbers are equal!";

        if (num1 > num2) {
            smallestNum = "The smallest number is: " + num2;
        } else if (num1 < num2) {
            smallestNum = "The smallest number is: " + num1;
        }
        
        return smallestNum;

    }
    
    public static String calculateMax(int num1, int num2) {

        String greatestNum = "These numbers are equal!";

        if (num1 > num2) {
            greatestNum = "The greatest number is: " + num1;
        } else if (num1 < num2) {
            greatestNum = "The greatest number is: " + num2;
        }
        
        return greatestNum;

    }

    public static String calculateMax(double num1, double num2) {

        String greatestNum = "These numbers are equal!";

        if (num1 > num2) {
            greatestNum = "The greatest number is: " + num1;
        } else if (num1 < num2) {
            greatestNum = "The greatest number is: " + num2;
        }
        
        return greatestNum;

    }

    public static int calculateAbsValue(int num1) {

        int absValue;

        if (num1 >= 0) {
            absValue = num1;
        } else {
            absValue = num1 * -1;
        }

        return absValue;

    }

    public static double calculateAbsValue(double num1) {

        double absValue;

        if (num1 >= 0) {
            absValue = num1;
        } else {
            absValue = num1 * -1;
        }

        return absValue;

    }

    //

}

//
