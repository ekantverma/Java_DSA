package BinaryTree;

import java.util.*;

import BinaryTree.BinaryTree1.Node;

public class BInaryTreeAssign {

    // Qs - 1
    static boolean isUnivalued(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.data != root.left.data) {
            return false;
        }
        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return isUnivalued(root.left) && isUnivalued(root.right);
    }

    // Qs - 2
    static Node mirror(Node root) {
        if (root == null) {
            return root;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Qs - 3
    public static Node deleteLeaf(Node root, int x) {
        if (root == null) {
            return null;
        }
        root.left = deleteLeaf(root.left, x);
        root.right = deleteLeaf(root.right, x);

        if (root.data == x && root.right == null && root.left == null) {
            return null;
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        System.out.println(deleteLeaf(root, 3));
        inorder(root);
    }
}
