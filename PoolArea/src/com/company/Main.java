package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rec width = " + rectangle.getWidth());
        System.out.println("rec length = " + rectangle.getLength());
        System.out.println("rec area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cub width = " + cuboid.getWidth());
        System.out.println("cub length = " + cuboid.getLength());
        System.out.println("cub area = " + cuboid.getArea());
        System.out.println("cub hight = " + cuboid.getHeight());
        System.out.println("cub volume = " + cuboid.getVolume());

    }
}
