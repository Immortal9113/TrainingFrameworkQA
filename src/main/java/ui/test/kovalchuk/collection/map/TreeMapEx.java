package ui.test.kovalchuk.collection.map;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Dima", "Kovalchuk",4);
        Student st2 = new Student("Olly", "Stepanjuk",5);
        Student st3 = new Student("Masha", "Nikonchuk",2);
        Student st4 = new Student("Zoya", "Sokolova",1);
        Student st5 = new Student("Sasha", "Polishuk",3);
        Student st6 = new Student("Igor", "Stepanov",5);
        Student st7 = new Student("Lola", "Sem",4);

        treeMap.put(7.7,st1);
        treeMap.put(3.7,st2);
        treeMap.put(5.1,st3);
        treeMap.put(5.1,st4);
        treeMap.put(6.6,st5);
        treeMap.put(7.5,st6);
        treeMap.put(1.7,st7);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());

    }

}
