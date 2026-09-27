class Node{
    int data;
    Node next;//null
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class add_node_start {
    Node head;
    public  void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        
         System.out.println("Null");
        
    }
    

public static void main(String[] args){
    add_node_start ad = new add_node_start();
    
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        ad.head=a;
        ad.addFirst(5);
        ad.display();

}

}