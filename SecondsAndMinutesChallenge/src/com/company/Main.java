package com.company;

public class Main {

    public static void main(String[] args) {

        String result = getDurationString(10, 6);
        System.out.println("Result = " + result);

        String result1 = getDurationString(70);
        System.out.println("Result1 = " + result1);
    }

    public static String getDurationString (int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid value ";
        }
        int hours;
        if (minutes >=60 ){
            hours = minutes / 60;
            minutes = minutes % 60;
        } else {
            hours = 0;
        }

        String result = (+hours + "h " + minutes + "m " + seconds + "s");
        return result;

    }

    public static String getDurationString (int seconds){
        if (seconds < 0) {
            return "Invalid value ";
        }

        int minutes;
        if (seconds >= 60){
            minutes = seconds /60;
            seconds = seconds % 60;
        } else {
            minutes = 0;
        }
        String result = getDurationString(minutes, seconds);
        return result;
    }
}
