package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sousage", 3.56, "white");
        double price = hamburger.itemizedHamburger();
        hamburger.addHamburgerAddition1("totamo", 0.27);
        hamburger.addHamburgerAddition2("lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese",1.12 );
        System.out.println("Total Burger price is " + hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);

        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total health burger price is " +healthyBurger.itemizedHamburger());

        DeluxBurger db = new DeluxBurger();
        db.itemizedHamburger();
        db.addHamburgerAddition1("adad", 4.5);

    }
}
