package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(60, 25, false);

        printer.fillToner(30);
        System.out.println("Cuurent tonner level " + printer.getTonerLevel());

        System.out.println("Pages printed = " + printer.getPagesPrinted());
        printer.printing(30);
        System.out.println("Pages printed = " + printer.getPagesPrinted());
    }
}
