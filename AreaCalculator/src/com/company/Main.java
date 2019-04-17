package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

      double areaofC = AreaCalculator.area (-1, 4.0);
        System.out.println("Area is = " +areaofC);
    }

    public static class AreaCalculator {

        public static double area (double radius) {
            if (radius < 0) {
                return -1;
            }
            double areacircle = radius * radius * Math.PI;
            return areacircle;
        }

        public static double area (double x, double y) {
            if (x<0 || y<0) {
                return -1;
            }
            double areaofrectangle = x * y;
            return areaofrectangle;
        }
    }
}
