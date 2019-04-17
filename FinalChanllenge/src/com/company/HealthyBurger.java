package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyextra1Name;
    private double healthyextra1Price;

    private String healthyextra2Name;
    private double healthyextra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyextra1Name = name;
        this.healthyextra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyextra2Name = name;
        this.healthyextra2Price = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(this.healthyextra1Name!=null){
            hamburgerPrice +=this.healthyextra1Price;
            System.out.println("Added " + this.healthyextra1Name + " for an extra " + this.healthyextra1Price);
        }

        if(this.healthyextra2Name!=null){
            hamburgerPrice +=this.healthyextra2Price;
            System.out.println("Added " + this.healthyextra2Name + " for an extra " + this.healthyextra2Price);
        }
        return hamburgerPrice;
    }
}
