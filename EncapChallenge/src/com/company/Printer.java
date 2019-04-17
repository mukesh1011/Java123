package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDual;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDual) {
        if (tonerLevel < -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDual = isDual;
    }

    public void fillToner(int ink){
        if (this.tonerLevel + ink <=100){
            this.tonerLevel = this.tonerLevel + ink;
        } else {
            System.out.println("can not refill toner");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDual() {
        return isDual;
    }

    public void printing(int page){
        this.pagesPrinted += page;
        System.out.println("Currntly printing");
    }
}
