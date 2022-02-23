package edu.training.inheritance.shape;

public class Circle extends Shape {
    public int numberOfSides = 0;

    Circle () {
        super(0);
        System.out.println("Constructor in Circle.");
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public int radius;

    public int area() {
        return (int) (Math.PI * radius * radius);
    }
}
