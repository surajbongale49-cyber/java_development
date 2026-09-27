class Node{
    int val;
    Node right;
    Node left;
    Node(int val){
        this.val=val;
    }
}
public class BST2 {
   public static boolean search(Node root,int target){
     if(root==null) return false;
     if(root.val==target){
        return true;
     }else if(root.val<target){
        return search(root.right,target);
     }else{
        return search(root.left,target);
     }
   }
   public static void main(String[] args){
    Node root=new Node(8);
    Node a=new Node(5);
    Node b=new Node(10);
    root.left=a;
    root.right=b;
    Node c=new Node(3);
    Node d=new Node(6);
    a.left=c;
    a.right=d;
    int target=5;
    boolean flag=search(root,target);
    System.out.println(flag);
   }
}