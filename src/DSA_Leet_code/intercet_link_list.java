class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class intercet_link_list {

    static Node head1;
    static Node head2;

    public static Node findIntersection() {

        int count1 = 0;
        int count2 = 0;

        Node temp1 = head1;
        Node temp2 = head2;

        // Count first list
        while (temp1 != null) {
            count1++;
            temp1 = temp1.next;
        }

        // Count second list
        while (temp2 != null) {
            count2++;
            temp2 = temp2.next;
        }

        // Reset pointers
        temp1 = head1;
        temp2 = head2;

        // Move longer list ahead
        if (count1 > count2) {
            for (int i = 0; i < count1 - count2; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < count2 - count1; i++) {
                temp2 = temp2.next;
            }
        }

        // Find intersection
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }

    public static void display1() {
        Node temp = head1;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void display2() {
        Node temp = head2;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        // First list
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        // Common part
        Node common = new Node(5);
        common.next = new Node(6);
        common.next.next = new Node(7);

        head1.next.next.next = common;

        // Second list
        head2 = new Node(8);
        head2.next = new Node(9);
        head2.next.next = common;

        System.out.println("First Linked List:");
        display1();

        System.out.println("Second Linked List:");
        display2();

        Node intersection = findIntersection();

        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}