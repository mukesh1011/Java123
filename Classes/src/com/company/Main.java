package com.company;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("commodore");
        System.out.println("Model is " + porsche.getModel());
    }
}
