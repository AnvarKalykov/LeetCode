package easy;

/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node
 in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */


public class LowestCommonAncestorBinarySearchTree {
    int val;
    LowestCommonAncestorBinarySearchTree left;
    LowestCommonAncestorBinarySearchTree right;
    LowestCommonAncestorBinarySearchTree(int x) { val = x; }
}

class Solution235 {
    public LowestCommonAncestorBinarySearchTree lowestCommonAncestor(LowestCommonAncestorBinarySearchTree root, LowestCommonAncestorBinarySearchTree p, LowestCommonAncestorBinarySearchTree q) {

        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, q, p);
        } else {
            return root;
        }

    }
}