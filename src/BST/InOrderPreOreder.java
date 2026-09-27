class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class InOrderPreOreder {
    public static int find(int[] inorder,int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(target==inorder[i]){
                return i;
            }
        }
        return -1;
    }
    public static Node tree(int[] inorder,int[] preorder,int inStart,int inEnd,int idx){
        if(inStart>inEnd){
            return null;
        }
        Node root=new Node(preorder[idx]);
        int pos=find(inorder,preorder[idx],inStart,inEnd);
        root.left=tree(inorder,preorder,inStart,pos-1,idx+1);
        root.right=tree(inorder,preorder,pos+1,inEnd,idx+(pos-inStart)+1);
        return root;
    }
    public static Node BuildTree(int[] inorder,int[] preorder){
        int n=inorder.length;
        return tree(inorder,preorder,0,n-1,0);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args){
        int[] inorder={9,3,15,20,7};
        int[] preorder={3,9,20,15,7};
        Node root=BuildTree(inorder,preorder);
        inorder(root);
    }
}
