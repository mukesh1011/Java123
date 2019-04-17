package com.company;

public class Point {

    private int x;
    private int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance (int x, int y){
        double distance = Math.sqrt(((this.x - x)*(this.x-x))+((this.y-y)*(this.y-y)));
        return distance;
    }
    public double distance(){
        double distance = distance(0,0);
        return distance;
    }

    public double distance (Point second){
        return distance(second.getX(), second.getY());
    }


}
