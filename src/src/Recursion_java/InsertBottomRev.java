import java.util.Stack;

public class InsertBottomRev {

    // Reverse the stack
    public static void reverse(Stack<Integer> st) {
        if (st.size() <= 1) {
            return;
        }

        int top = st.pop();

        reverse(st);

        insertAtBottom(st, top);
    }

    // Insert element at bottom
    public static void insertAtBottom(Stack<Integer> st, int ele) {

        if (st.isEmpty()) {
            st.push(ele);
            return;
        }

        int top = st.pop();

        insertAtBottom(st, ele);

        st.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original stack: " + st);

        int ele = 60;

        insertAtBottom(st, ele);

        System.out.println("After inserting at bottom: " + st);

        reverse(st);

        System.out.println("After reversing: " + st);
    }
}