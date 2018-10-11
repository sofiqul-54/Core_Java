package com.sofiqul54.binarySearch;

public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.key + " ");
    }
    
    void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        printPreorder(node.left);
        printPreorder(node.right);
        System.out.println(node.key + " ");
    }
    
    void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        printInorder(node.right);
        System.out.println(node.key + " ");
    }
    
 void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    // Driver method 
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.print("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.print("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }

}
