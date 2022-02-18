package edu.training;

public class StaticExample {

     static int staticField = 50;
     int nonStaticField = 60;

    public static void main(String[] args) {

        StaticExample staticExample = new StaticExample();
        staticExample.staticField = 100;
        staticExample.nonStaticField = 300;

        StaticExample staticExample1 = new StaticExample();
        System.out.println("Static value: " + staticExample1.staticField);
        System.out.println("Non Static value: " + staticExample1.nonStaticField);

    }

}
