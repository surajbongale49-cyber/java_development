class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Travesr_diff_way {
    static Node head;
    public static void dispaly(){
    Node temp=head;
    while(temp.next!=null){
       System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("Null");
}
    public static void main(String[] args){
        head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        System.out.println("Original Linlklist :");
        dispaly();
    }
 
}
