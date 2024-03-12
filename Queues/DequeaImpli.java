package Queues;

import java.util.*;

public class DequeaImpli { // Double ended queue (Fifo)
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(3);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
