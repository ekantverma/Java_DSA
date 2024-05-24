import java.util.*;

import javax.swing.tree.TreeNode;

public class l617 {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static Node mergeTrees(Node root1, Node root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    public static void main(String[] args) {
        Node root1 = new Node(1, null, null);
        root1.left = new Node(3, null, null);
        root1.right = new Node(2, null, null);
        root1.left.left = new Node(5, null, null);
        root1.left.right = new Node(1, null, null);
        root1.right.left = new Node(4, null, null);
        root1.right.right = new Node(4, null, null);
        Node root2 = new Node(1, null, null);
        root2.left = new Node(2, null, null);
        root2.right = new Node(3, null, null);
        root2.left.left = new Node(1, null, null);
        root2.left.right = new Node(1, null, null);
        root2.right.left = new Node(1, null, null);
        root2.right.right = new Node(1, null, null);
        Node root = mergeTrees(root1, root2);
        System.out.println(root.val);

    }
}
