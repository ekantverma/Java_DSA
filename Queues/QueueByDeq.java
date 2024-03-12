package Queues;

import java.util.*;

public class QueueByDeq { // (FIFO)

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // add
        public void add(int data) {
            deque.addLast(data);
        }

        // remove
        public int remove() {
            return deque.removeFirst();
        }

        // peek
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
