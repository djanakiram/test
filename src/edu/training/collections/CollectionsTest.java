package edu.training.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {

    public static void main(String[] args) {
        {
            Set<Integer> set = new HashSet<>();
            set.add(3);
            set.add(1);
            set.add(2);
            set.add(1);
            set.add(0);
//        System.out.println(set);

            for (int i : set) {
                System.out.println(i);
            }


            Iterator i = set.iterator();
            for (; i.hasNext(); ) {
                System.out.println(i.next());
            }

            System.out.println("Contains zero: " + set.contains(0));
        }
        {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(2);

            list.add(2, 10);
            for(int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

            for (int i : list) {
                System.out.println(i);
            }
        }
        {
            Map<String, Integer> marks = new HashMap<>();
            marks.put("A", 10);
            marks.put("B", 20);

            System.out.println(marks.get("B"));

            for(String name: marks.keySet()) {
                System.out.println(name);
            }

            for(Integer i : marks.values()) {
                System.out.println(i);
            }

            for(Map.Entry entry: marks.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }

}
