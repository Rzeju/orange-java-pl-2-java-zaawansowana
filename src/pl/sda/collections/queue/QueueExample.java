package pl.sda.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("1");
        myQueue.offer("2");
        myQueue.offer("3");
        myQueue.offer("4");
        myQueue.offer("5");

        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.element());
        System.out.println(myQueue);

    }
}
