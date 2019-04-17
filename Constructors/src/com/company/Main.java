package com.company;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "087-123-456");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
    }
}