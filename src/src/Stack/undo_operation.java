public class undo_operation {
    // Stack ADT using array
    static class Stack {
        String[] id = new String[20];
        String[] type = new String[20];
        int[] amount = new int[20];
        int top = -1;

        void push(String transactionId, String transactionType, int transactionAmount) {
            top++;
            id[top] = transactionId;
            type[top] = transactionType;
            amount[top] = transactionAmount;
        }

        void pop() {
            if (top == -1) {
                return;
            }
            top--;
        }

        String getId() {
            return id[top];
        }

        String getType() {
            return type[top];
        }

        int getAmount() {
            return amount[top];
        }

        boolean isEmpty() {
            return top == -1;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            for (int i = top; i >= 0; i--) {
                System.out.println(id[i] + "  " + type[i] + "  " + amount[i]);
            }
        }
    }

    public static void main(String[] args) {

        Stack transactionStack = new Stack();
        Stack cancelledStack = new Stack();
        Stack undoStack = new Stack();

        // Transaction stream

        transactionStack.push("T01", "LOGIN", 0);
        transactionStack.push("T02", "DEPOSIT", 5000);
        transactionStack.push("T03", "WITHDRAW", 1200);
        transactionStack.push("T04", "TRANSFER", 2500);
        transactionStack.push("T05", "DEPOSIT", 3000);

        // T06 CANCEL
        if (!transactionStack.isEmpty()) {
            cancelledStack.push(
                transactionStack.getId(),
                transactionStack.getType(),
                transactionStack.getAmount()
            );
            transactionStack.pop();
        }

        transactionStack.push("T07", "WITHDRAW", 1800);
        transactionStack.push("T08", "TRANSFER", 4500);
        transactionStack.push("T09", "DEPOSIT", 2000);

        // T10 UNDO
        if (!transactionStack.isEmpty()) {
            undoStack.push(
                transactionStack.getId(),
                transactionStack.getType(),
                transactionStack.getAmount()
            );
            transactionStack.pop();
        } else {
            System.out.println("ERROR: No transaction available for UNDO");
        }

        transactionStack.push("T11", "WITHDRAW", 1000);

        // T12 CANCEL
        if (!transactionStack.isEmpty()) {
            cancelledStack.push(
                transactionStack.getId(),
                transactionStack.getType(),
                transactionStack.getAmount()
            );
            transactionStack.pop();
        }

        transactionStack.push("T13", "DEPOSIT", 3500);
        transactionStack.push("T14", "TRANSFER", 6000);

        // T15 UNDO
        if (!transactionStack.isEmpty()) {
            undoStack.push(
                transactionStack.getId(),
                transactionStack.getType(),
                transactionStack.getAmount()
            );
            transactionStack.pop();
        } else {
            System.out.println("ERROR: No transaction available for UNDO");
        }

        // Display final transaction stack
        System.out.println("FINAL VALID TRANSACTION STACK:");
        transactionStack.display();

        // Display cancelled transactions
        System.out.println("\nCANCELLED TRANSACTIONS:");
        cancelledStack.display();

        // Display undo transactions
        System.out.println("\nUNDO STACK:");
        undoStack.display();
    }
}