package easy;

/*
Given the root of a binary tree, invert the tree, and return its root.
 */

public class InvertBinaryTree {
    int val;
    InvertBinaryTree left;
    InvertBinaryTree right;
    InvertBinaryTree() {}
    InvertBinaryTree(int val) { this.val = val; }
    InvertBinaryTree(int val, InvertBinaryTree left, InvertBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution226 {
    public InvertBinaryTree invertTree (InvertBinaryTree root) {
        if (root == null) {
            return null;
        }

        InvertBinaryTree left = invertTree(root.left);
        InvertBinaryTree right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
