package ui.test.kovalchuk.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(10);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(5);
        priorityQueue.add(17);

        System.out.println(priorityQueue.peek());

    }
}
