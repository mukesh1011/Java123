package com.company;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumebr;

    public Account() {
        this("5678", 2.50, "Default Name", "Default Address", "default number");
        System.out.println("Empty contructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumebr) {
        System.out.println("Account constructor with parameter called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumebr = phoneNumebr;
    }

    public Account(String customerName, String email, String phoneNumebr) {
        this("99999", 100.55,customerName,email,phoneNumebr);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumebr(String phoneNumebr) {
        this.phoneNumebr = phoneNumebr;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumebr() {
        return this.phoneNumebr;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made . Ner balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount <= 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not possible");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Reamining balance = " + this.balance);
        }
    }


}
