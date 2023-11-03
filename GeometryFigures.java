import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Defines an interface for geometric figures
interface GeometryFigures extends Comparable<GeometryFigures> {
    double calculateArea();

    double calculatePerimeter();

    String getName();

    // Implementation of compareTo to sort by area
    @Override
    default int compareTo(GeometryFigures anotherFigure) {
        double areaDifference = this.calculateArea() - anotherFigure.calculateArea();
        if (areaDifference > 0) {
            return 1;
        } else if (areaDifference < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

// Implement concrete classes for different geometric figures
class Circle implements GeometryFigures {
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

    public String getName() {
        return "Circle";
    }
}

class Square implements GeometryFigures {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public String getName() {
        return "Square";
    }
}

class Triangle implements GeometryFigures {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        return 3 * base;
    }

    public String getName() {
        return "Triangle";
    }
}
