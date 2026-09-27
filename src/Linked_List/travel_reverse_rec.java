class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class travel_reverse_rec {
    public static void rec(Node head){
    if(head==null)return ;
    rec(head.next);
    System.out.print(head.data+" ");
}
    public static void main(String[] args){
        Node a=new Node(420);
        Node b=new Node(120);
        Node c=new Node(320);
        Node d=new Node(20);
        Node e=new Node(720);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        rec(a);
      
    }
}
