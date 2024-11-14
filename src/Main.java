abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public double calculateArea() {
        return (a * height) / 2;
    }
    public double calculatePerimeter() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
            System.out.println(c1.calculateArea());
            System.out.println(c1.calculatePerimeter());

        Triangle t1 = new Triangle(4, 3, 2, 1);
            System.out.println(t1.calculateArea());
            System.out.println(t1.calculatePerimeter());
    }
}