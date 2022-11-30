package com.mycompany.prak5;

public class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double raduis, double height) {
        super("Cylinder"); 
        this.radius = raduis;
        this.height = height;
    }   
//    public double getRaduis() {
//        return radius;
//    }
//
//    public void setRaduis(double raduis) {
//        this.radius = raduis;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
    @Override
    public double area(){
        return Math.PI*(radius * radius)* height;
    }
    @Override
    public String toString(){
        return super.toString() +" of radius "+ radius;
    }
}
