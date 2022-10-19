package ui.test.kovalchuk.collection.list;

import java.util.ArrayList;

public class UdemyList {


    public static void main(String[] args) {




        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sasha");
        arrayList1.add("Oxana");
        arrayList1.add("Vasya");
        arrayList1.add(1,"Misha");

        for (String s : arrayList1){
            System.out.println(s + " ");
        }
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(6);
//        for(int i= 0; i < arrayList1.size();i++ )
//        System.out.println(arrayList1.get(i));

        arrayList1.set(1,"Kolya");  /* заміна */
        System.out.println(arrayList1);

        arrayList1.remove(0);  /* видалення */
        System.out.println(arrayList1);





    }

}
