class Shape {
    public double area() {
        return 0.0;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 3);
        double triangleArea = triangle.area();
        System.out.println("Area of Triangle: " + triangleArea);

        Rectangle rectangle = new Rectangle(4, 6);
        double rectangleArea = rectangle.area();
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
