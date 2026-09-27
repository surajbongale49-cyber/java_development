class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Remove_common_node {
    static Node head;
    public static void common(){
        Node first=head;
        Node Second=head;
        while(first!=null){
            if(first.data==Second.data){
                first=first.next;
            }else{
                Second.next=first;
                Second=first;
            }
        }
        Second.next=first;  
      
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
        head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(1);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next=new Node(3);
        head.next.next.next.next.next.next.next=new Node(3);
        head.next.next.next.next.next.next.next.next=new Node(4);
        head.next.next.next.next.next.next.next.next.next=new Node(4);
        System.out.println("Original LinkList :");
        display();
        common();
        System.out.println("After removing common node :");
        display();
        
    }

}
