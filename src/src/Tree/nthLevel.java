// import java.util.Scanner;
public class nthLevel{
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static void nthLevel(Node root,int n){
        if(root==null) return;
        if(n==1)System.out.print(root.val +" ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static int height(Node root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void main(String[] args){
    //    Scanner sc=new Scanner(System.in);
       Node root=new Node(10);
       Node a=new Node(20);
       Node b=new Node(30);
       root.left=a;
       root.right=b;
       Node c=new Node(40);
       Node d=new Node(50);
       a.left=c;
       a.right=d;
       Node e=new Node(60);
       b.right=e;
    //    System.out.println("Enter the Number :");
    //    int n=sc.nextInt();
       System.out.println("the all level of tree element's are :");
       int level=1+height(root);
       for(int i=1;i<=level;i++){
          nthLevel(root,i);
          System.out.println();
       }
       
    }
}