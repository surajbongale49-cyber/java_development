import java.util.Stack;
public class Removenodeleetcode {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public static void call(Node head,Stack<Node> st){
        Node temp=head;
        while(temp!=null){
            while(st.size()>0 && st.peek().val<temp.val){
                st.pop();
            }
            st.push(temp);
            temp=temp.next;
        }
      
        while(st.size()>0){
            Node top=st.pop();
            top.next=temp;
            temp=top;
        }
        display(temp);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args){
        Stack<Node> st=new Stack<>();
        Node a=new Node(5);
        a.next=new Node(2);
        a.next.next=new Node(13);
        a.next.next.next=new Node(3);
        a.next.next.next.next=new Node(8);
        display(a);
        System.out.println();
        call(a,st);
    }

}
