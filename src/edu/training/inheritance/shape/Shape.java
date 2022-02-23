package edu.training.inheritance.shape;

public class Shape {

    protected int numberOfSides = -1;
    public int field = -1;

    public Shape() {
        System.out.println("Constructor in Shape.");
    }

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int test() {
        return -1;
    }

    protected int getNumberOfSides() {
        return numberOfSides;
    }

    public int area() {
        return 0;
    }
}
