package binaryTree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BinaryTree {
    Node root;

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print("" + root.data + " ");
        inOrder(root.right);
    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    public static int sizeOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        return sizeOfTree(root.right) + sizeOfTree(root.left) + 1;
    }

    public static int maxOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(root.data, Math.max(maxOfTree(root.left),maxOfTree(root.right)));
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(5);

        inOrder(tree.root);
        System.out.println();
        System.out.println("Height of Tree: " + heightOfTree(tree.root));
        System.out.println("Size Of Tree: " + sizeOfTree(tree.root));
        System.out.println("Max Of Tree: " + maxOfTree(tree.root));
    }

}




