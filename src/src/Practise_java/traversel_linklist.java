import java.util.Scanner;
public class traversel_linklist {
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // static Node head;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Node :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            Node newNode=new Node(x);
        }
        Node temp=newNode;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

}
