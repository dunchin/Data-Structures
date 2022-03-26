package com.company.binaryTree;

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
            return Math.max(heightOfTree(root.left), heightOfTree(root.right)) +1 ;
        }
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
        //inOrder(root);
        System.out.println(heightOfTree(root));
    }


}
