package org.example;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double computePerimeter(){
        return 2 * a + 2 * b;
    }

    public double computeArea(){
        return a * b;
    }

    public double computeDiagonalLength(){
        return Math.sqrt(a * a + b * b);
    }
}
