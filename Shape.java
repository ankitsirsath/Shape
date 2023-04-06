import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    // Non-abstract method to display shape name
    public void showShape(String shape) {
        System.out.println("Shape: " + shape);
    }

    // Abstract method to calculate shape's area
    public abstract void calculateArea();

    // Abstract method to calculate shape's perimeter
    public abstract void calculatePerimeter();
}

// Interface Volume
interface Volume {
    // Abstract method to calculate shape's volume
    public abstract void calculateVolume();
}

// Class Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Method to calculate perimeter of circle
    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    // Method to calculate volume of circle (not implemented)
    public void calculateVolume() {
        System.out.println("Volume calculation is not applicable for Circle");
    }
}

// Class Rectangle
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area of rectangle
    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate perimeter of rectangle
    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    // Method to calculate volume of rectangle (not implemented)
    public void calculateVolume() {
        System.out.println("Volume calculation is not applicable for Rectangle");
    }
}

// Class Square
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // Method to calculate area of square
    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Method to calculate perimeter of square
    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }

    // Method to calculate volume of square (not implemented)
    public void calculateVolume() {
        System.out.println("Volume calculation is not applicable for Square");
    }
}

// Class Sphere
class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of sphere
    @Override
    public void calculateArea() {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Surface Area of Sphere: " + area);
    }

    // Method to calculate perimeter of sphere (not implemented)
    public void calculatePerimeter() {
        System.out.println("Perimeter calculation is not applicable for Sphere");
    }

    // Method to calculate volume of sphere
    @Override
    public void calculateVolume() {
        double volume = 4 / 3 * Math.PI;
    }
    
}
