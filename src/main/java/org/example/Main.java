package org.example;

public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1.5;

        Figure figure1 = new Triangle(a, b, c);
        Figure figure2 = new Rectangle(a, b);

        System.out.println(String.format("Triangle with sides: %f, %f, %f has perimeter equal %f", a, b, c, figure1.computePerimeter()));
        System.out.println(String.format("Triangle with sides: %f, %f, %f has area equal %f", a, b, c, figure1.computeArea()));

        System.out.println(String.format("Rectangle with sides: %f, %f has perimeter equal %f", a, b, figure2.computePerimeter()));
        System.out.println(String.format("Rectangle with sides: %f, %f has area equal %f", a, b, figure2.computeArea()));

        Rectangle figure3 = (Rectangle) figure2;
        System.out.println(String.format("Rectangle with sides: %f, %f has diagonal of length %f", a, b, figure3.computeDiagonalLength()));

    }
}