package ui.test.kovalchuk.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.isEmpty());
        set.add("Dima");
        set.add("Zoya");
        set.add("Lev");
        set.add("Kostya");
        set.add("Zina");
        set.add("Lev");

        System.out.println(set.isEmpty());

        System.out.println(set.contains("Dima"));


        System.out.println(set.size());
        System.out.println(set);

        for (String s : set){
            System.out.println(s);

        }

    }
}
