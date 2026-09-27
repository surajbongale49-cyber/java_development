class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class traversal_recursion {
    // Recursive display function
    public static void displayrec(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayrec(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(400);
        Node b = new Node(50);
        Node c = new Node(90);
        Node d = new Node(700);
        Node e = new Node(300);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayrec(a);
    }
}
