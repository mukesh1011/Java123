package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInches(1,-10);
        calcFeetAndInches(100);
    }

    public static double calcFeetAndInches(double feet, double inches) {

        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid paraters");
            return -1;
        }
        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm");
        return cm;

    }

    public static double calcFeetAndInches(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double  remainInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet" );
        return calcFeetAndInches(feet, remainInches);

    }
}
