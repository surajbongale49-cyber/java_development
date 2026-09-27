import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class preOrderStack{
    public static int[] operation(Stack<Node> st,int[] arr,Node root){
       st.push(root);
       int i=0;
       while(!st.isEmpty()){
        root=st.pop();
        arr[i]=root.val;
        if(root.right!=null){
            st.push(root.right);
        }
        if(root.left!=null){
            st.push(root.left);
        }
        i++;
       }
       return arr;
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static void main(String[] args){
        Stack<Node> st=new Stack<>();
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
        System.out.println(t);
        int[] arr=new int[t];
        int[] brr=operation(st,arr,root);
        System.out.println("the preorde :-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     
    }

}
