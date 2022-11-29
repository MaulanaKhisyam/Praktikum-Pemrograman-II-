package com.mycompany.prak5;

public class Rectangle extends Shape {
    private double length, width;
    
    public Rectangle(Double l, Double w){
        super("Rectangle");
        length = 1;
        width = w;
    }
    public double area(){
        return length * width;
    }
    public String toString(){
        return super.toString() + "of length " + length + "and width "+ width;
    }
}
