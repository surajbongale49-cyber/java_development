public class LinklistImplementation {

    public static class Node { // User defined data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack { // User defined data structure
        private Node head = null;
        private int size = 0;

        // Push operation
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // Pop operation
        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            int x = head.val;
            head = head.next;
            size--;

            return x;
        }

        // Peek operation
        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            return head.val;
        }

        // Recursive display: Bottom to Top
        void displayrec(Node head) {
            if (head == null)
                return;

            displayrec(head.next);
            System.out.print(head.val + " ");
        }

        void display() {
            displayrec(head);
            System.out.println();
        }

        // Display: Top to Bottom
        void displayrev() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Size
        int size() {
            return size;
        }

        // Check empty
        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        LLStack st = new LLStack();

        st.push(4);
        st.display();

        st.push(5);
        st.display();

        st.push(1);
        st.display();

        System.out.println("Size = " + st.size());

        System.out.println("Popped = " + st.pop());

        System.out.println("Peek = " + st.peek());

        System.out.println("Size = " + st.size());

        System.out.print("Top to Bottom: ");
        st.displayrev();
    }
}