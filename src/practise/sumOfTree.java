class Node{
    int val;
    Node right;
    Node left;
    Node(int val){
        this.val=val;
    }
}
public class sumOfTree{
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
        System.out.println("The sum of tree is :");
        System.out.println(sum(root));
    }
}