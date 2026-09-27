import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class rotate_Link_lIst {
    static Node head;
    public static void rotate(int k) {
        if (head == null || head.next == null || k == 0)
            return;
        // Find length
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        k = k % count;
        if (k == 0)
            return;
        int move = count - k;
        Node prev = null;
        curr = head;
        while (move-- > 0) {
            prev = curr;
            curr = curr.next;
        }

        // Break the list
        prev.next = null;

        // Find tail of second part
        Node tail = curr;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Join lists
        tail.next = head;
        head = curr;
    }

    // Display
    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Original Linked List:");
        display();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        rotate(k);

        System.out.println("Rotated Linked List:");
        display();

        sc.close();
    }
}