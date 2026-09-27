import java.util.Scanner;
class Transaction {
    String id;
    String type;
    int amount;

    Transaction(String id, String type, int amount){
        this.id=id;
        this.type=type;
        this.amount=amount;
    }

    void display(){
        System.out.println(id + "  " + type + "  " + amount);
    }
}

class Stack {
    Transaction[] arr;
    int top;

    Stack(int size) {
        arr=new Transaction[size];
        top=-1;
    }

    void push(Transaction t) {
        if(top==arr.length-1){
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = t;
    }

    Transaction pop(){
        if(top==-1){
            return null;
        }

        Transaction t=arr[top];
        top--;

        return t;
    }

    Transaction peek(){
        if (top==-1){
            return null;
        }

        return arr[top];
    }

    boolean isEmpty(){
        return top==-1;
    }

    void display(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }

        for(int i=top;i>=0;i--){
            arr[i].display();
        }
    }
}

public class Undo_op_1 {

    static Stack transactionStack = new Stack(20);
    static Stack cancelledStack = new Stack(20);
    static Stack undoStack = new Stack(20);

    static void processTransaction(Transaction t) {

        if(t.type.equals("CANCEL")){

            Transaction cancelled = transactionStack.pop();

            if(cancelled == null){
                System.out.println("ERROR: No transaction available for CANCEL");
            } else {
                cancelledStack.push(cancelled);

                System.out.println(cancelled.id +"cancelled successfully.");
            }

        } else if(t.type.equals("UNDO")){

            Transaction undone = transactionStack.pop();

            if(undone==null){
                System.out.println("ERROR: No transaction available for UNDO");
            }else{
                undoStack.push(undone);

                System.out.println(undone.id +"undone successfully.");
            }

        }else if(t.type.equals("RECOVER")){

            Transaction recovered=cancelledStack.pop();

            if(recovered==null){
                System.out.println("ERROR: No cancelled transaction available for RECOVER");
            } else {
                transactionStack.push(recovered);
                System.out.println(recovered.id + " recovered successfully.");
            }

        } else {
            transactionStack.push(t);
            System.out.println(t.id +"added to Transaction Stack.");
        }
    }

    public static void main(String[] args) {
        Transaction[] transactions = {
            new Transaction("T01", "LOGIN", 0),
            new Transaction("T02", "DEPOSIT", 5000),
            new Transaction("T03", "WITHDRAW", 1200),
            new Transaction("T04", "TRANSFER", 2500),
            new Transaction("T05", "DEPOSIT", 3000),
            new Transaction("T06", "CANCEL", 0),
            new Transaction("T07", "WITHDRAW", 1800),
            new Transaction("T08", "TRANSFER", 4500),
            new Transaction("T09", "DEPOSIT", 2000),
            new Transaction("T10", "UNDO", 0),
            new Transaction("T11", "WITHDRAW", 1000),
            new Transaction("T12", "CANCEL", 0),
            new Transaction("T13", "DEPOSIT", 3500),
            new Transaction("T14", "TRANSFER", 6000),
            new Transaction("T15", "UNDO", 0)
        };
        System.out.println("===== TRANSACTION PROCESSING =====");

        for(Transaction t:transactions){
           System.out.println("\nProcessing:"+t.id + " " + t.type);
           processTransaction(t);
        }

        System.out.println("\n===== FINAL TRANSACTION STACK =====");
        transactionStack.display();

        System.out.println("\n===== CANCELLED TRANSACTION STACK =====");
        cancelledStack.display();

        System.out.println("\n===== UNDO STACK =====");
        undoStack.display();
    }
}