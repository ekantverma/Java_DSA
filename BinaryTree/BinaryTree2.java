package BinaryTree;

import java.util.*;

import BinaryTree.BinaryTree1.Node;

public class BinaryTree2 {

    // Height of tree
    public static int heightTree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int diameter(Node root) { // 0(n2)
        if (root == null) {
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int lh = heightTree(root.left);
        int rh = heightTree(root.right);

        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam, Math.max(leftDia, rightDia));
    }

    // Approach 2 of diameter of a tree / O(n)
    static class Info {
        int diameter;
        int ht;

        public Info(int diameter, int ht) {
            this.diameter = diameter;
            this.ht = ht;
        }
    }

    public static Info diameterOfTree(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameterOfTree(root.left);
        Info rightInfo = diameterOfTree(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left = new Node(7);

        System.out.println(diameterOfTree(root).diameter);
    }
}
