package com.pluralsight.calcengine2ndcourse;

public interface MathProcessing {
    String SEPARATOR = "";
    String getKeyWord();
    double doCalculation(double leftVal,double rightVal);
    default String getFormattedOutput(){
        return null;
    }
}
