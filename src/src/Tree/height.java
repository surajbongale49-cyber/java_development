public class height { 
    public static class Node { 
        int data; 
        Node left; 
        Node right; 
        public Node(int data) { 
            this.data = data; 
        } 
    } 

    public static int height(Node root) { 
        if (root == null) return 0; 
        if (root.left == null && root.right == null) return 0; 
        return 1 + Math.max(height(root.left), height(root.right)); 
    } 

    public static int max(Node root) { 
        if (root == null) return Integer.MIN_VALUE; 
        int x = root.data; 
        int y = max(root.left); 
        int z = max(root.right); 
        return Math.max(x, Math.max(y, z)); 
    } 

    public static int sum(Node root) { 
        if (root == null) return 0; 
        return root.data + sum(root.left) + sum(root.right);   
    } 

    public static int size(Node root) { 
        if (root == null) return 0; 
        return 1 + size(root.left) + size(root.right); 
    } 

    public static void main(String[] args) { 
        Node root = new Node(-1); 
        Node a = new Node(-2); 
        Node b = new Node(-3); 
        root.left = a; 
        root.right = b; 
        Node c = new Node(-4); 
        Node d = new Node(-300); 
        a.left = c; 
        a.right = d; 
        Node e = new Node(-6); 
        Node f = new Node(-7); 
        b.right = e; 
        b.left = f; 

        System.out.println(size(root)); 
        System.out.println(sum(root)); 
        System.out.println(max(root)); 
        System.out.println(height(root)); 
    } 
}