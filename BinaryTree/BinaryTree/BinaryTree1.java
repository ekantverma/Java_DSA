package BinaryTree;

import java.util.*;

public class BinaryTree1 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }

        // Level order traversal
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // Height of tree
        public static int heightTree(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = heightTree(root.left);
            int rh = heightTree(root.right);
            return Math.max(lh, rh) + 1;
        }

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }

            int lc = count(root.left);
            int rc = count(root.right);
            return lc + rc + 1;
        }

        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);
            return ls + rs + root.data;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println(tree.sum(root));
    }
}