class Node{
    int val;
    Node right;
    Node left;

    Node(int val){
        this.val=val;
    }

}
public class BSTArray {
    public static Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val<root.val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
   public static void main(String[] args){
        int[] arr={50,30,70,20,40,60,80};
        int n=arr.length;
        Node root=null;
        for(int i=0;i<n;i++){
           root=insert(root,arr[i]);
        }
        inorder(root);
   }
}
