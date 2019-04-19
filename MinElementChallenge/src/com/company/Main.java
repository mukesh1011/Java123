package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = readInteger(5);

        System.out.println("Minimum element = " +findMin(array));
    }

    private static int[] readInteger(int count){
        int[] array = new int[count];
        System.out.println("Enter Elements:\r");
        for (int i=0;i<count;i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
