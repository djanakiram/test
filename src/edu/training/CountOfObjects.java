package edu.training;

public class CountOfObjects {

    static int count = 0;

    CountOfObjects() {
        count++;
    }

    public static void main(String[] args) {
        CountOfObjects cob = new CountOfObjects();
        System.out.println(cob.count);

        CountOfObjects cob1 = new CountOfObjects();
        System.out.println(cob1.count);
    }
}
