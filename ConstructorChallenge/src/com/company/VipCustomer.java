package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
//        this.name = "Tim";
//        this.creditLimit= 999.00;
//        this.email = "tim@email.com";
        this("Tim", 999.00, "tim@email.com");
    }

    public VipCustomer(String CustName, double climit){
        //this.name = CustName;
        //this.creditLimit = climit;
        //this.email = "tim@email.com";
        this(CustName, climit, "tim@email.com");
    }

    public VipCustomer(String CustName, double climit, String email){
        this.name = CustName;
        this.creditLimit = climit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
