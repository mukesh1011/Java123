package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer cust1 = new VipCustomer("Max", 98.99, "max@email.com");

        System.out.println("Name = " + cust1.getName() + " Credit Limit = " + cust1.getCreditLimit() + " email= " + cust1.getEmail());


    }
}
