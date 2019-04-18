package com.company;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue =5d / 3d;

        System.out.println("myIntValue=" + myIntValue);
        System.out.println("myfloatvalue=" + myFloatValue);
        System.out.println("mydoublevalue=" + myDoubleValue);

        double myPound = 5d;
        double myKG = myPound * 0.45359237d;
        System.out.println("Weight in KG =" +myKG);
    }
}
