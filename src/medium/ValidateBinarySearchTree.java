package medium;

/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */

public class ValidateBinarySearchTree {
    int val;
    ValidateBinarySearchTree left;
    ValidateBinarySearchTree right;

    ValidateBinarySearchTree() {
    }

    ValidateBinarySearchTree(int val) {
        this.val = val;
    }

    ValidateBinarySearchTree(int val, ValidateBinarySearchTree left, ValidateBinarySearchTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution98 {
    ValidateBinarySearchTree prev = null;

    public boolean isValidBST(ValidateBinarySearchTree root) {
        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left)) return false;

        if (prev != null && prev.val >= root.val) {
            return false;
        }
        prev = root;

        if (!isValidBST(root.right)) {
            return false;
        }

        return true;
    }
}