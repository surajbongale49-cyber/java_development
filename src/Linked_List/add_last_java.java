class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class add_last_java {
 Node head;
 Node tail;
 public void addLast(){
    Node newNode = new Node(60);
    tail.next=newNode;
    tail=newNode;
 }
 public void display(){
   Node temp = head;
   while(temp!=null){
    System.out.print(temp.data+"->");
    temp=temp.next;
   }
   System.out.print("Null");
    
 }

 public static void main(String[] args){
    Node a= new Node(10);
    Node b= new Node(20);
    Node c= new Node(30);
    Node d=new Node(40);
    Node e= new Node(50);

    a.next=b;
    a.next.next=c;
    a.next.next.next=d;
    a.next.next.next.next=e;
    
    add_last_java ab = new add_last_java();

    ab.head=a;
    ab.tail=e;
    ab.addLast();
    ab.display();
    
    
 }


}
