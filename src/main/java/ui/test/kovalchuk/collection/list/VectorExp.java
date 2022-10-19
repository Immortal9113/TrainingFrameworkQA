package ui.test.kovalchuk.collection.list;

import java.util.Vector;

public class VectorExp {
    public static void main(String[] args) {
       Vector<String> vector = new Vector();
       vector.add("Kolya");
       vector.add("Ssha");
       vector.add("Sveta");
       vector.add("Olya");

        System.out.println(vector);
        System.out.println("________________");
        System.out.println("First element "+vector.firstElement());
        System.out.println("________________");
        System.out.println("Last element "+vector.lastElement());
        vector.remove(2);
        System.out.println("After remove element 2" +vector);
        System.out.println(vector.isEmpty());
        vector.removeAll(vector);
        System.out.println(vector.isEmpty());
        System.out.println("After remove all" +vector);



    }
}
