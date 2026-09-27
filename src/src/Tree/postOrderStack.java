import java.util.*;
public class postOrderStack {
 public static int[] operation(Stack<Node> st1,Stack<Node> st2,int[] arr,Node root){
    st1.push(root);
    int i=0;
    while(!st1.isEmpty()){
        Node curr=st1.pop();
        st2.push(curr);
        if(curr.left!=null){
            st1.push(curr.left);
        }
        if(curr.right!=null){
            st1.push(curr.right);
        }
    }
    while(!st2.isEmpty()){
        arr[i]=st2.pop().val;
        i++;
    }
    return arr;
 }
 public static int size(Node root){
    if(root==null) return 0;
    return 1+size(root.left)+size(root.right);
 }
  public static void main(String[] args){
    Stack<Node> st1=new Stack<>();
    Stack<Node> st2=new Stack<>();
     Node root=new Node(1);
     Node a=new Node(2);
     Node b=new Node(7);
     Node c=new Node(3);
     Node d=new Node(4);
     Node e=new Node(5);
     Node f=new Node(6);
     root.left=a;
     root.right=b;
     a.left=c;
     a.right=d;
     d.left=e;
     d.right=f;
     int t= size(root);
     int[] arr=new int[t];
     int[] brr=operation(st1,st2,arr,root);
     System.out.println("The postOrder is :-");
     for(int i=0;i<brr.length;i++){
        System.out.print(brr[i]+" ");
     }
  }
}
