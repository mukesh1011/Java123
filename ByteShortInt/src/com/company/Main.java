package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 100;
        int myInt = 68000;
        long myLong = 50000L + 10L * ( myByte + myShort + myInt);
        System.out.println("Long Total =" + myLong);


    }
}
