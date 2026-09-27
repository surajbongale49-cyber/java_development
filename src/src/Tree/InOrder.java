public class InOrder {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    // Preorder: Root -> Left -> Right
    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder: Left -> Root -> Right
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Postorder: Left -> Right -> Root
    public static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        root.left = a;
        root.right = b;
        Node c = new Node(40);
        Node d = new Node(50);
        a.left = c;
        a.right = d;
        Node e = new Node(60);
        Node f = new Node(70);
        b.left = e;
        b.right = f;

        System.out.println("The Preorder elements are:");
        preOrder(root);
        System.out.println();

        System.out.println("The Inorder elements are:");
        inOrder(root);
        System.out.println();

        System.out.println("The Postorder elements are:");
        postOrder(root);
    }
}
