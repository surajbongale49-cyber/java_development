class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class MInimuminBst {
    public static Node Bsearch(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(root.val>val){
            root.left=Bsearch(root.left,val);
        }else{
            root.right=Bsearch(root.right,val);
            
        }
        return root;
    }
    public static Node Min(Node root){
        Node head=root;
        while(head.left!=null){
            head=head.left;
        }
        return head;
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
    int[] arr={5,4,6,3,8,9,7,1};
    int n=arr.length;
    Node root=null;
    for(int i=0;i<n;i++){
        root=Bsearch(root,arr[i]);
    }
    System.out.println("the Tree is :-");
    display(root);
    System.out.println();
    Node temp=Min(root);
    System.out.println("The MINIMUM Element in tree is :-");
    System.out.println(temp.val);
   }
}
