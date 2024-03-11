package Queues;

import java.util.*;

public class QueueUsingTwoStack { // Imp Qs | (Microsoft, Google)

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public static void add(int data) { // O(n)
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove
        public static int remove() { // O(1)
            if (isEmpty()) {
                System.out.println("Qs Empty");
                return -1;
            }

            return s1.pop();
        }

        // Peek

        public static int peek() { // O(1)
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
