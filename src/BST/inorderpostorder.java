class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class inorderpostorder {
    public static int find(int[] inorder,int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static Node tree(int[] inorder,int[] postorder,int inStart,int inEnd,int idx){
        if(inStart>inEnd){
            return null;
        }
        Node root=new Node(postorder[idx]);
        int pos=find(inorder,postorder[idx],inStart,inEnd);
        root.right=tree(inorder,postorder,pos+1,inEnd,idx-1);
        root.left=tree(inorder,postorder,inStart,pos-1,idx-(inEnd-pos)-1);
        return root;
    }
  public static Node Buildtree(int[] inorder,int[] postorder){
    int n=inorder.length;
    return tree(inorder,postorder,0,n-1,n-1);

  }
  public static void display(Node root){
    if(root==null){
        return;
    }
    display(root.left);
    System.out.print(root.val+" ");
    display(root.right);
  }
  public static void main(String[] args){
    int[] inorder={9,3,15,20,7};
    int[] postorder ={9,15,7,20,3};
    Node root=Buildtree(inorder,postorder);
    display(root);
  }
}
