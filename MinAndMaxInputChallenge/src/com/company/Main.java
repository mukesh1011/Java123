package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        boolean first = true;

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNext = s.hasNextInt();
            if (hasNext) {
                int number  = s.nextInt();
                if (first){
                    first = false;
                    min = number;
                    max = number;

                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;

                }
            } else {
                break;
            }
            s.nextLine();

        }

        System.out.println("Min: " + min + " Max: " +max);

        s.close();

    }
}
