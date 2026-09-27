import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Swap_link_list {

    static Node head;

    // Function to swap data of two nodes
    static void swap(Node first, Node second) {
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }

    static void swapK(int k) {

        // Count nodes
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (k <= 0 || k > count) {
            System.out.println("Invalid k");
            return;
        }

        // kth node from beginning
        Node first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // kth node from end
        Node second = head;
        for (int i = 1; i <= count - k; i++) {
            second = second.next;
        }

        // Call swap function
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

        sc.close();
    }
}