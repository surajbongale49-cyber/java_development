import java.util.Scanner;
public class Double_the_Ele {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
 public static void main(String[] arsg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the No of Element in Linklist :");
    int n=sc.nextInt();
    Node head=null;
    Node temp=null;
    System.out.println("Enter the Element's :");
    for(int i=0;i<n;i++){
        int data=sc.nextInt();
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            temp=newNode;
        }else{
            temp.next=newNode;
            temp=newNode;
        }
        
    }
    System.out.println("Original LinkList :");
    temp=head;
    int sum=0;
    while(temp!=null){
        sum=sum*10+temp.data;
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("NUll"); 
    System.out.println("The sum is "+2*sum);
    int t=2*sum;
    int r=0;
    int rem;
    Node newHead=null;
    while(t!=0){
         rem=t%10;
        Node newNode=new Node(rem);
            newNode.next = newHead;
            newHead = newNode;
       t=t/10;
    }
     // Display result
        temp = newHead;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("Null");
 }
}
