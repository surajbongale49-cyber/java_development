class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Node_insert_at_end {
    static Node head;

    public static void newNode(int data) {
        Node last = new Node(data);

        Node temp1 = head;

        while (temp1.next != null) {
            temp1 = temp1.next;
        }

        temp1.next = last;
    }

    public static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original Linked List:");
        display();

        newNode(80);

        display();
    }
}
