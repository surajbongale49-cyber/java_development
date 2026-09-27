class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Sum_of_linklist {
    static Node head;
    public static int  display(){
        Node temp=head;
        int sum=0;
        while(temp!=null){
         sum=sum+temp.data;
         temp=temp.next;
        }
        return sum;
    }
    public static void main(String[] args){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        display();
        System.out.println("the Sum of all element present in the Linklist is :"+display());
    }

}
