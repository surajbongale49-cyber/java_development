import java.util.Scanner;
public class Input_From_User {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number of element in the Linklist :");
      int n=sc.nextInt();

        Node head = null;
        Node temp = null;

      System.out.println("Enter elements:");
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
      System.out.println("Display Linklist :");
      temp=head;
      while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
      }
      System.out.println("Null");
   }
}
