class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class DeletBst {
    public static Node delete(Node root,int target){
        if(root==null){
            return null;
        }
        if(target<root.val){
            root.left=delete(root.left,target);
        }else if(target>root.val){
            root.right=delete(root.right,target);
        }else{
            //case 1:No child
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2:Only right child
            if(root.left==null){
                return root.right;
            }
            //case 2:Only left child
            if(root.right==null){
                return root.left;
            }
            // case4: Two children
            Node successor=findMin(root.right);
            root.val=successor.val;
            root.right=delete(root.right,successor.val);
        }
        return root;
    }
    public static Node findMin(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
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
    public static void display(Node root){
        if(root==null){
            return ;
        }
        display(root.left);
        System.out.print(root.val+" ");
        display(root.right);
    }
   public static void main(String[] args){
    int[] arr={50,30,70,20,40,60,80};
    int n=arr.length;
    Node root=null;
    for(int i=0;i<n;i++){
        root=insert(root,arr[i]);
      }
      display(root);
      root=delete(root,70);
      System.out.println();
      display(root);
   }
}
