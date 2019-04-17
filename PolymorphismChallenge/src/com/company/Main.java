package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car --> startEngine()";
    }

    public String accelerate(){
        return "Car --> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

}

class Mitsibishi extends Car{
    public Mitsibishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsibishi --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsibishi --> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsibishi --> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford --> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford --> brake()";
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden --> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden --> brake()";
    }
}
public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsibishi mitsibishi = new Mitsibishi(6, "Outlander");
        System.out.println(mitsibishi.startEngine());
        System.out.println(mitsibishi.accelerate());
        System.out.println(mitsibishi.brake());

        Ford ford = new Ford(6, "Ford Facom");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


        Holden holden = new Holden(6, "Holden Commoder");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }



}
