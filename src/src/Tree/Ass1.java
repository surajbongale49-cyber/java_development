class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class Ass1 {

    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
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

    public static void display(Node root,String space){
        if(root==null){
            return ;
        }
        System.out.println(space+root.val);
        if(root.left!=null)System.out.println(space+"L--> "+root.left.val);
        if(root.right!=null)System.out.println(space+"R--> "+root.right.val);
        display(root.left,space+"   ");
        display(root.right,space+"   ");
    }

    public static int height(Node root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void lev(Node root,int n){
        if(root==null){
            return ;
        }
        if(n==1)System.out.print(root.val+" ");
        lev(root.left,n-1);
        lev(root.right,n-1);
    }
     public static void search(Node root,int target){
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.val);
            if(temp.val==target){
            System.out.println("\nfile is Found ");
            return ;
            }
            System.out.print(" --> ");
            if(temp.val<target){
                temp=temp.right;
            }else{
                temp=temp.left;
            }
        }
        System.out.println("file is not found");
    }

    public static int leafNodes(Node root){
            if(root.left==null && root.right==null){
                return 1;
            }
            return leafNodes(root.left)+leafNodes(root.right);    
    }

    public static int internalNode(Node root){
        if(root==null||(root.left==null && root.right==null)){
            return 0;
        }
        return 1+internalNode(root.left)+internalNode(root.right);
    }

    public static int largest(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(largest(root.left),largest(root.right)));
    }
    public static int smallest(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val,Math.min(smallest(root.left),smallest(root.right)));
    }
    
   public static void main(String[] args){
    int[] arr={50,30,70,20,40,60,80,10,25,35,45};
    Node root=null; 
    for(int i=0;i<arr.length;i++){
        root=insert(root,arr[i]);
    }

    System.out.println("#--------BINARY SEARCH TREE--------#");
    display(root," ");
    System.out.println();

    System.out.println("#--------Inorder traversal---------#");
    inorder(root);
    System.out.println();

    System.out.println("#--------Preorder traversal---------#");
    preorder(root);
    System.out.println();

    System.out.println("#--------Postorder traversal---------#");
    postorder(root);
    System.out.println();
    System.out.println();

    int level=1+height(root);
    System.out.println("#-----Level-order Traversal-----#");
    for(int i=1;i<=level;i++){
        lev(root,i);
        System.out.println();
    }
    System.out.println();
 
    System.out.println("#--------SEARCH--------#");
    System.out.println("Path for 35 :-");
    search(root,35);
    System.out.println(); 

    System.out.println("#--------Analyze--------#");
    System.out.println("Height of Tree :-"+height(root));
    System.out.println("Total No of leafNode :-"+leafNodes(root));
    System.out.println("Total No of InternalNode :-"+internalNode(root));
    System.out.println("Largest file Id:-"+largest(root));
    System.out.println("Smallest file Id:-"+smallest(root));
    

   }
}
