package ui.test.kovalchuk.collection.set;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);


        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

////        HashSet<Integer> union = new HashSet<>(hashSet1);
////        union.addAll(hashSet2); /* залишає унікальні елементи */
////        System.out.println(union);
//
//        HashSet<Integer> intersect = new HashSet<>(hashSet1);
//        intersect.retainAll(hashSet2);/* залишає дубльовані елементи */
//        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);/* видаляє всі елементи від hashSet2 в hashSet1 */
        System.out.println(subtract);



    }
}
