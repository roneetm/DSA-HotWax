package LinkedList;

public class LinkedList {
    static Node head;

    public static void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    /*
    Deleting from any position of the data is present.
     */
    private static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print("[" + temp.data + "]" + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private static void delete(int data) {
        if (head == null) {
            return;
        }
        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            if (temp.data == data) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    private static void deleteFromStart() {
        if (head == null) {
            return;
        }
        Node temp = head;
        Node prev = null;
        // If head itself is the data
        if (temp != null) {
            head = temp.next;
            return;
        }
    }

    private static void deleteFromEnd() {
        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }

    private static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        head = newNode;
        newNode.next = temp;
        //head = newNode.next;
    }

    private static void insertAtPosition(int position, int data) {
        Node node = new Node(data);
        if (position == 0) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    private static boolean searchValue(int data) {
        Node temp = head;
        while (temp != null) {

            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        display();
        delete(20);
        delete(80);
        insertAtBeginning(5);
        insertAtPosition(0, 15);
        System.out.println();
        display();
        System.out.println("Value Present: " + searchValue(90));
        deleteFromStart();
        deleteFromEnd();
        display();
    }
}