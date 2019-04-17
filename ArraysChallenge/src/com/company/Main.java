package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int[] array  = getIntegers(5);
        printArray(array);
        int[] sorted = sortIntegers(array);
        printArray(sorted);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortIntegers(int[] array){
        int[] newArray = new int[array.length];
        for (int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }


        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0;i<newArray.length-1;i++){
                if(newArray[i] < newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
