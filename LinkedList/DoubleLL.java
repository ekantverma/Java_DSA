public class DoubleLL {

    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add and remove last
    public void addlast(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node temp = new Node(data);
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    // delete from Dll
    public boolean deletelast() {
        if (head == null) {
            return false;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        tail = temp.prev;
        size--;
        return true;
    }

    // Add first in Dll
    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // delete first
    public boolean deletefirst() {
        if (head == null) {
            return false;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return true;
    }

    // Print Double linkedlist
    public void printDLL() {
        Node temp = head;
        System.out.println("Size of DLL: " + size);
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Reverse a Doubly LL
    public void reverseDLL() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.addfirst(4);
        dll.addlast(5);
        dll.addlast(6);
        System.out.println("Added 5 and 6");
        dll.reverseDLL();
        dll.printDLL();
    }
}