package binaryTree;

import java.util.Scanner;

// Inorder      Left, Node , Right  - >  LNR
// Pre-Order    Node , Left , Right - >  NLR
// Post-Order   Right , Left , Node - >  RLN


public class TreeTraversals {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    static public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    static public int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
        }
    }

    static public int sizeOfTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;
        }
    }


    // Max of a Tree
    static public int maxOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.data >= maxOfTree(root.left) && root.data >= maxOfTree(root.right)) {
            return root.data;
        } else if (root.data <= maxOfTree(root.left) && maxOfTree(root.left) >= maxOfTree(root.right)) {
            return maxOfTree(root.left);
        } else {
            return maxOfTree(root.right);
        }
    }

    // Max of a tree - Alternate Programme

    static public int maxOfTreev2(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(root.data, Math.max(maxOfTree(root.left), maxOfTree(root.right)));
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
        root = new Node(data);

        System.out.println("Enter Data for Left: " + data);
        root.left = createTree();

        System.out.println("Enter Data for Right: " + data);
        root.right = createTree();

        return root;
    }

    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        System.out.println("Height of Tree: " + heightOfTree(root));
        System.out.println("Size of Tree: " + sizeOfTree(root));
        System.out.println("Max of a Tree " + maxOfTree(root));
        System.out.println("Max of a Tree v2 " + maxOfTreev2(root));

    }


}
