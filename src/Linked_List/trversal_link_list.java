class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
        this.next = null;
    }
}
public class trversal_link_list{
    public static void main(String[] args) {
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
