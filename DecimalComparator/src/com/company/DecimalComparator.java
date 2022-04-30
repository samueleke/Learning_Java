package com.company;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double parameterOne, double parameterTwo) {

        int paramOne = (int) (parameterOne * 1000);
        int paramTwo = (int) (parameterTwo * 1000);

        return paramOne == paramTwo;
    }
}

