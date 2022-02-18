package edu.training;

public class TestingEncapsulation {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Jeep");

        test(vehicle);

        System.out.println(vehicle.getName());
    }

    private static void test(Vehicle vehicle) {
        vehicle.setName("Sedan");
    }
}
