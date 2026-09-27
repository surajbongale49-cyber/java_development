class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class palidrome_link_list {
   // Reverse the linked list
    public static Node reverse(Node head) {
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
     // Check if linked list is palindrome
    public static boolean isPalindrome(Node head) {
        if(head==null && head.next==null){
            return true;
        }

        Node fast=head;
        Node slow=head;
       //find middle
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondhalf=reverse(slow.next);
        Node firsthalf=head;
        Node temp=secondhalf;

        while (temp != null) {
            if (firsthalf.data != temp.data) {
                return false;
            }

            firsthalf = firsthalf.next;
            temp = temp.next;
        }

        return true;
    
    }

    //display linklist
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args){
        
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);

        System.out.println("Original_linklist :");
        display(head);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a Palindrome.");
        } else {
            System.out.println("The linked list is NOT a Palindrome.");
        }
    }

}
