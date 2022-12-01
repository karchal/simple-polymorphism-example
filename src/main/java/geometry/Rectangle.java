package geometry;

public class Rectangle implements Figure {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter(){
        return 2 * a + 2 * b;
    }

    public double getArea(){
        return a * b;
    }

    public double computeDiagonalLength(){
        return Math.sqrt(a * a + b * b);
    }
}
