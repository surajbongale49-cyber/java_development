public class Diameter {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public static int height(Node root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int BFS(Node root){
       if(root==null || root.left==null && root.right==null) return 0;
       int leftAns=BFS(root.left);
       int rightAns=BFS(root.right);
       int mid=height(root.left)+height(root.right);
       if(root.left!=null) mid++;
       if(root.right!=null) mid++;
       int max=Math.max(leftAns,Math.max(mid,rightAns));
       return max;
    }
    public static void main(String[] args){
       Node root=new Node(1);
       Node a=new Node(2);
       Node b=new Node(3);
       Node c=new Node(4);
       Node d=new Node(5);
       Node e=new Node(8);
       Node f=new Node(9);
       Node g=new Node(10);
       Node h=new Node(11);
       Node i=new Node(12);
       Node j=new Node(13);
       Node k=new Node(14);
       Node l=new Node(6);
       Node m=new Node(7);
       root.left=a;
       root.right=b;
       a.left=c;
       a.right=d;
       c.left=e;
       c.right=f;
       e.left=g;
       e.right=h;
       g.left=i;
       g.right=j;
       i.left=k;
       b.left=l;
       b.right=m;
       System.out.println( BFS(root));

      
    }

}
