
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Swap_2 {

    static Node head;

    public static void swap(int k) {

        // Count number of nodes
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Check invalid k
        if (k <= 0 || k > count) {
            System.out.println("Invalid k");
            return;
        }

        // Find kth node from beginning
        Node first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Find kth node from end
        Node second = head;
        for (int i = 1; i <= count - k; i++) {
            second = second.next;
        }

        // Swap data
        int t = first.data;
        first.data = second.data;
        second.data = t;
    }

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

        System.out.println("The Original Linked List:");
        display();

        System.out.println("Enter the Number:");
        int k = sc.nextInt();

        swap(k);

        System.out.println("After Swapping:");
        display();

       
    }
}