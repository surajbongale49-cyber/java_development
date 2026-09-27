public class Stackexample {

    int MAXSTK = 5;
    int[] stack = new int[MAXSTK];
    int top = -1;

    // PUSH operation
    public void push(int item) {

        // Check Overflow
        if (top == MAXSTK - 1) {
            System.out.println("OVERFLOW");
            return;
        }

        // Increase TOP
        top = top + 1;

        // Insert item
        stack[top] = item;
    }

    // POP operation
    public int pop() {

        // Check Underflow
        if (top == -1) {
            System.out.println("UNDERFLOW");
            return -1;
        }

        // Store top element
        int item = stack[top];

        // Decrease TOP
        top = top - 1;

        return item;
    }

    // Display stack
    public void display() {

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        Stackexample s = new Stackexample();

        // PUSH
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Stack after PUSH:");
        s.display();

        // POP
        int item = s.pop();

        System.out.println("Popped item: " + item);

        System.out.println("Stack after POP:");
        s.display();
    }
}