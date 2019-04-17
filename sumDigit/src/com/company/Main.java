package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Sum of Digit = " + sumDigits(5));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            return -1;
        }

        while (number >0 ) {
            int lsd = number % 10;
            sum = sum + lsd;
            number = number / 10;
        }


        return sum;
    }
}
