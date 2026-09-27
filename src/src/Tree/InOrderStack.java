import java.util.*;
public class InOrderStack {
    public static int[] inorder(Stack<Node> st,int[] arr,Node root){
        Node temp=root;
        int i=0;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                temp=st.pop();
                arr[i]=temp.val;
                i++;
                temp=temp.right;
            }
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
     int t=size(root);
     int[] arr=new int[t];
     int[] brr=inorder(st,arr,root);
     System.out.println("Inorder traversal is :");
     for(int i=0;i<brr.length;i++){
        System.out.print(brr[i]+" ");
     }
   }
}
