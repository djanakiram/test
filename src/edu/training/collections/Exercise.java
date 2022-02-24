package edu.training.collections;

import edu.training.Person;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static void main(String[] args) {

        Map<Integer, Person> personsMap = new HashMap<>();
        personsMap.put(0, new Person("Ram", 20));
        personsMap.put(1, new Person("Laxman", 19));


        // TODO: Traverse the map values and then print the names of the persons in ascending order or their age.
    }
}
