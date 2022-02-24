package edu.training.inheritance.shape;

public class TestInheritance {

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        System.out.println("Number of sides: " + shape.numberOfSides);
        System.out.println(shape.field);
        shape.test();

        int a = 1000000;

        Rectangle rectangle = (Rectangle) shape;
        System.out.println("Number of sides: " + rectangle.numberOfSides);
        System.out.println(rectangle.fieldRect);
        System.out.println(rectangle.field);
        rectangle.test();
        rectangle.testRect();

        TestInheritance testInheritance = new TestInheritance();
        testInheritance.sum((float) 1,2);

        testInheritance.printNumberOfSides(shape);
        testInheritance.printNumberOfSides(rectangle);
        testInheritance.printNumberOfSides(new Circle());
    }

    public void printNumberOfSides(Shape shape) {
//        System.out.println("Printing shape: " + shape.getNumberOfSides());
        System.out.println("Printing test: " + shape.test());
    }

    public int sum(int a, int b) {
        System.out.println("Calling sum int.");
        return a + b;
    }

    public float sum(float a, float b) {
        System.out.println("Calling sum float.");
        return a + b;
    }

    public float sum(float a, int b) {
        System.out.println("Calling sum float, int.");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
