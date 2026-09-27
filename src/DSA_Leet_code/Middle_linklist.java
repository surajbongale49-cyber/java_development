class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Middle_linklist {

    static Node head;

    public static void middle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Print from middle node
        display(slow.next);
    }

    // Display from a given node
    public static void display(Node start) {
        Node temp = start;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    // Display complete linked list
    public static void display() {
        display(head);
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original Linked List:");
        display();

        System.out.println("From Middle Node:");
        middle();
    }
}
