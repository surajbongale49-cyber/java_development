class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Cyclic_linklist { 
    // public static void display(Node head){
    //     Node temp=head;
    //     while(temp!=){
    //         System.out.print(temp.data+"-->");
    //     }
    // }
    static boolean hasCycle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=c;
        // System.out.println("the Original linklist is :");
        // display(a);
        if (hasCycle(a)) {
            System.out.println("Cycle is present");
        } else {
            System.out.println("Cycle is not present");
        }
        
    }

}
