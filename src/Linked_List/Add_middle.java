class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
   
}
public class Add_middle {
    static Node head;
    public static void middle(int position){
        Node newNode=new Node(25);
        Node temp=head;
        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
     public static void display(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
            count++;
        }
        System.out.println("Null");
        System.out.println(count);
    }
    public static void main(String[] args){
        head =new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        System.out.print("Original Linklist :");
        display();
        middle(3);
        System.out.println("After Adding the Middle Node :");
        display();
    }

}
