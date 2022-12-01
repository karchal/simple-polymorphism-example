package geometry;

public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1.5;

        Figure figure1 = new Triangle(a, b, c);
        Figure figure2 = new Rectangle(a, b);

        System.out.printf("Triangle with sides: %f, %f, %f has perimeter equal %f%n", a, b, c, figure1.getPerimeter());
        System.out.printf("Triangle with sides: %f, %f, %f has area equal %f%n", a, b, c, figure1.getArea());

        System.out.printf("Rectangle with sides: %f, %f has perimeter equal %f%n", a, b, figure2.getPerimeter());
        System.out.printf("Rectangle with sides: %f, %f has area equal %f%n", a, b, figure2.getArea());

        Rectangle figure3 = (Rectangle) figure2;
        System.out.printf("Rectangle with sides: %f, %f has diagonal of length %f%n", a, b, figure3.computeDiagonalLength());

    }
}