import java.util.*; // JCF

public class LL2 {
    public static void main(String[] args) {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        // Add in LL
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        // 0 -> 1 -> 2 -> 3
        System.out.println(ll);

        // Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
