class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=next;
    }
}
public class SortLinkedlist {
    public static Node merge(Node left,Node right){
        Node dummy=new Node(0);
        Node temp=dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        return dummy.next;
    }
    public static Node mergedsort(Node head){

        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow.next;
        slow.next=null;

        Node left=mergedsort(head);
        Node right=mergedsort(mid);

        return merge(left,right);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
   public static void main(String[] args){
    Node a=new Node(4);
    a.next=new Node(1);
    a.next.next=new Node(3);
    a.next.next.next=new Node(2);
    display(a);
    a=mergedsort(a);
    display(a);
   }
}
