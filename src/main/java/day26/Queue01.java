package day26;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*
      1) "FIFO" means first in first out. If you need a functionality contains FIFO ,prefer to use Queue
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Rick");
        queue.add("Maggie");
        queue.add("Glenn");
        queue.add("Megan");
        queue.add("Daryl");

        Queue<String> queue1 = new LinkedList<>();
        queue.element();
        queue.peek();

       // queue1.element();
        queue1.peek();

        queue1.offer("XXXXX");

        queue.poll();


        Queue<String> queue3 = new PriorityQueue<>();

        queue3.add("Rick");
        queue3.add("Maggie");
        queue3.add("Glenn");
        queue3.add("Megan");
        queue3.add("Daryl");

        System.out.println(queue3);
        // When you use PriorityQueue<>() constructor to create Queue, it is possible to create sorting logic.




























    }
}
