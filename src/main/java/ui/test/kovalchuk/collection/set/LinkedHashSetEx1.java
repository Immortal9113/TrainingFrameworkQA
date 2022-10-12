package ui.test.kovalchuk.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(4);
        lhs.add(2);
        lhs.add(6);
        lhs.add(7);
        lhs.add(11);
        lhs.add(9);

        System.out.println(lhs);

        for (Integer s : lhs){
            System.out.println(s);
        }

    }
}
