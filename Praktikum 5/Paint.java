package com.mycompany.prak5;

public class Paint {
   
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }
    public double amount (Shape s){
        System.out.println("Compiting amount for "+ s);
        return s.area();
    }
}
