package ui.test.kovalchuk.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1119, "Dima Kovalchuk");
        map1.put(1758, "Olly Kovalchuk");
        map1.put(1990, "Lev Kovalchuk");
        map1.put(3090, "Vasya Kosyan");
        map1.put(1111, "Vasya Kosyan");
        map1.put(null, "Katya Volosha");
        map1.put(2323, null);
        map1.putIfAbsent(1119, "Dima Kovalchuk");
        map1.putIfAbsent(1239, "Dima Kovalchuk");

        System.out.println(map1);
        System.out.println(map1.get(1758));
        map1.remove(null);
        System.out.println(map1);

        System.out.println(map1.containsValue("Vasya Kosyan"));
        System.out.println(map1.containsKey(1110));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha","Doctor");
        map2.put("Vasya","Vodij");
        map2.put("Jura","QA");
        map2.put("Sveta","AQA");
        map2.put("Olly","Dev");
        System.out.println(map2);
    }
}
