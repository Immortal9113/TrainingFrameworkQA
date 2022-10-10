package ui.test.kovalchuk.collection.queue;

import com.google.common.collect.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Dima");
        queue.add("Zoya");
        queue.add("kolya");
        queue.add("Katya");
        queue.add("Tolya");
        queue.add("Stepa");


        queue.offer("Saya");
        queue.offer("Sasha");
        queue.offer("Sonya");
        queue.offer("Sveta");

        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}
