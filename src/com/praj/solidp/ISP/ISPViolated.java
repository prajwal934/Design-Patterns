package com.praj.solidp.ISP;


// Single Interface  for all  shapes (violates ISP)
interface Shape {
    double area();
    double volume();
}
// Square is a 2D shape but forced to implement volume()
class Square implements Shape {
    private double side;

    public Square(double s) {
        this.side= s;
    }
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Volume not applicable for Square"); //un-necessary method.
    }
}

// Rectangle also a 2D shape but it forced to be implement volume();

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double l, double w) {
        this.length=l;
        this.width=w;
    }

    @Override
    public double area() {
        return length * width;
    }

    public double volume() {
        throw new UnsupportedOperationException("Volume not applicable for rectangle"); //un-necessary method.
    }
}

// Cube is a 3D shape, so it's actually has a volume().
class Cube implements  Shape {
    private double side;

    public Cube(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
public class ISPViolated {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape rect = new Rectangle(4,5);
        Shape cube = new Cube(6);

        System.out.println("Square Area: "+square.area());
        System.out.println("Rectangle Area: "+rect.area());
        System.out.println("Cube Area: "+ cube.area());
        System.out.println("Cube Volume: "+cube.volume());

        try {
            System.out.println("Square Volume: " + square.volume());
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
