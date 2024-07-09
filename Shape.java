class Shape {
    public double area() {
        return 0.0;
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }
}

class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of Square: " + square.area());

        Circle circle = new Circle(3);
        System.out.println("Area of Circle: " + circle.area());
    }
}

