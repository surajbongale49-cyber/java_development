
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Swap_link_list_2 {

    static Node head;

    // Swap data of two nodes
    static void swap(Node first, Node second) {
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }

    static void swapK(int k) {

        Node first = head;

        // Find kth node from beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Find kth node from end using two pointers
        Node fast = head;
        Node second = head;

        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            second = second.next;
        }

        // Swap
        swap(first, second);
    }

    static void display() {
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

        System.out.println("Original Linked List:");
        display();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        swapK(k);

        System.out.println("After Swapping:");
        display();

    }
}