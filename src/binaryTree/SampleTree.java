package binaryTree;

import java.util.Scanner;

public class SampleTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            //this.left = left;
            //this.right = right;
        }


    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if(data == -1){
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
       createTree();
    }
}
