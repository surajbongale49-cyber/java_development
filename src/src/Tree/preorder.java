public class preorder {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static void preOreder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOreder(root.left);
        preOreder(root.right);
    }
    public static void main(String[] args){
       Node root=new Node(1);
       Node a=new Node(2);
       Node b=new Node(3);
       root.left=a;
       root.right=b;
       Node c=new Node(4);
       Node d=new Node(5);
       a.left=c;
       a.right=d;
       Node e=new Node(6);
       b.right=e;
       preOreder(root);
    }
}
