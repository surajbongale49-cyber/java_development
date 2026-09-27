class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveNthNode {
    static Node head;
    public static void RemoveNthFromEnd(int n){
        //count total nodes
        int count=0;
        Node temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        //if first node has to be deleted
        if(count==n){
            head=head.next;
            return;
        }
        //find previous node of the node to delete
        int pos=count-n;
        temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        //Delete node
        temp.next=temp.next.next;
    }

    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args){
        head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        System.out.println("Original List:");
        display();

        RemoveNthFromEnd(2);

        System.out.println("After Deletion :");
        display();
    }

}
