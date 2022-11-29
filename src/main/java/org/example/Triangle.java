package org.example;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double computePerimeter(){
        return a + b + c;
    }
    public double computeArea(){
        double p = computePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
