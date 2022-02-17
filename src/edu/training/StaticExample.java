package edu.training;

public class StaticExample {

     static int staticField = 10;
     int nonStaticField = 20;

    public static void main(String[] args) {

        StaticExample staticExample = new StaticExample();
        staticExample.staticField = 20;
        staticExample.nonStaticField = 30;

        StaticExample staticExample1 = new StaticExample();
        System.out.println("Static value: " + staticExample1.staticField);
        System.out.println("Non Static value: " + staticExample1.nonStaticField);

    }

}
