package Queues;

import java.util.*;

public class QueuesByArr {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Circular Queue
        public static boolean isFull() {
            return rear + 1 % size == front;
        }

        // Add In Queues
        public static void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // Add 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove in Queues
        public static int removeQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // last ele remove
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek in Queues
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.removeQueue());
        q.equals(5);
        System.out.println(q.removeQueue());
        q.enqueue(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.removeQueue();
        }

    }
}
