package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("result is now = " + result);
        result++;
        System.out.println("result is now = " + result);

        result--;
        System.out.println("result is now = " + result);
        result += 2;
        System.out.println("result is now = " + result);
        result *= 10;
        System.out.println("result is now = " + result);
        result -= 10;
        System.out.println("result is now = " + result);
        result /= 10;
        System.out.println("result is now = " + result);

        boolean isAlient = false;
        if (isAlient == false)
            System.out.println("Is is not an Alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newvalue = 50;

        if (newvalue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar)
            System.out.println("This is not suppose to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");


        double varDouble1 = 20;
        double varDouble2 = 80;

        double varResult1 = (varDouble1 + varDouble2) * 25;
        System.out.println("The results 1 = " + varResult1);
        double varResult2 = varResult1 % 40;
        System.out.println("The results 2 = " + varResult2);
        if (varResult2 <= 20)
            System.out.println("Total is over the limit");
    }
}
