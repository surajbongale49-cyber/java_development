class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class inprepost {
   public static void preOrder(Node root){
    if(root==null){
        return ;
    }
    System.out.print(root.val+" ");
    preOrder(root.left);
    preOrder(root.right);
   }

   public static void inOrder(Node root){
    if(root==null){
        return;
    }
    inOrder(root.left);
    System.out.print(root.val+" ");
    inOrder(root.right);
   }
   public static void postOrder(Node root){
    if(root==null){
        return;
    }
    postOrder(root.left);
    preOrder(root.right);
    System.out.print(root.val+" ");
   }

   public static void main(String[] args){
    Node root=new Node(25);
    Node a=new Node(15);
    Node b=new Node(50);
    Node c=new Node(10);
    Node d=new Node(22);
    root.left=a;
    root.right=b;
    a.left=c;
    a.right=d;
    Node e=new Node(4);
    Node f=new Node(12);
    c.left=e;
    c.right=f;
    Node g=new Node(18);
    Node h=new Node(24);
    d.left=g;
    d.right=h;
    Node i=new Node(35);
    Node j=new Node(70);
    b.left=i;
    b.right=j;
    Node k=new Node(31);
    Node l=new Node(44);
    i.left=k;
    i.right=l;
    Node m=new Node(66);
    Node n=new Node(90);
    j.left=g;
    j.right=h;
    System.out.println("The Inorder tree Element :");
    inOrder(root);
    System.out.println();
    System.out.println("The preorder tree Element :");
    preOrder(root);
    System.out.println();
    System.out.println("The postorder tree Element :");
    postOrder(root);
    System.out.println();

   }
}
