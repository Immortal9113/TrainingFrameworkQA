package ui.test.kovalchuk;

import java.util.ArrayList;
import java.util.LinkedList;


public class Test_list {

    public static void removeElements(ArrayList<String> myArrayList, int border) {

        for (int i = myArrayList.size() - 1; i > border - 1; --i) {


            myArrayList.remove(i);
        }


    }

    public static void removeElements(LinkedList<String> myLinkedList, int border) {

        for (int i = myLinkedList.size() - 1; i > border - 1; --i) {


            myLinkedList.remove(i);
        }


    }


    public static void arrayListAdd(ArrayList<String> myArraList, int number) {

        for (int i = 0; i < number; i++) {
            myArraList.add("Sos");

        }


    }

    public static void linkedListAdd(LinkedList<String> myLinkedList, int number) {
        for (int i = 0; i < number; i++) {
            myLinkedList.add("Sos");
        }

    }


    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        LinkedList<String> myLinkedList = new LinkedList<>();

        long startTimeArrayList = System.currentTimeMillis();


        arrayListAdd(myArrayList, 100);


        long stopTimeArrayList = System.currentTimeMillis();


        long startTimeLinkedAdd = System.currentTimeMillis();
        linkedListAdd(myLinkedList, 100);


        long stopTimeLinkedAdd = System.currentTimeMillis();
        long arrayAddTime = stopTimeArrayList - startTimeArrayList;
        long linkedListTime = stopTimeLinkedAdd - startTimeLinkedAdd;


        System.out.println("ArrayList " + myArrayList.size());
        System.out.println("adding Time result for ArrayList " + arrayAddTime);
        System.out.println("LinkedList " + myLinkedList.size());
        System.out.println("adding Time result for linkedList " + linkedListTime);


        long startTimeArrayListRem = System.currentTimeMillis();

        removeElements(myArrayList, 1000);

        long stopTimeArrayListRem = System.currentTimeMillis();
        long arrayListRem = stopTimeArrayListRem - startTimeArrayListRem;

        System.out.println("remove Time result for ArrayList " + arrayListRem);
        System.out.println("after remove");
        System.out.println("ArrayList " + myArrayList.size());


        long startTimeLinkedListRem = System.currentTimeMillis();
//        removeElements(myLinkedList);

        long stopTimeLinkedListRem = System.currentTimeMillis();
        long linkedListRem = stopTimeLinkedListRem - startTimeLinkedListRem;


        System.out.println("remove Time result for LinkedList " + linkedListRem);
        System.out.println("after remove");
        System.out.println("ArrayList " + myLinkedList.size());
//вивести всі елементи колекції !!!!!
        for (String mls : myLinkedList) {

            System.out.println(mls);
        }


    }

}
