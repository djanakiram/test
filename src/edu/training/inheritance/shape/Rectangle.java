package edu.training.inheritance.shape;

public class Rectangle extends Shape {
    public int numberOfSides = 2;
    public int fieldRect = 2;

    Rectangle () {
        super(2);
        System.out.println("Constructor in Rectangle.");
    }

    public int testRect() {
        return 2;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    private int length;
    private int width;

    public int area() {
        return length * width;
    }
}
