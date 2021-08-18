package easy;

public class DiameterBinaryTree {
    int val;
    DiameterBinaryTree left;
    DiameterBinaryTree right;
    DiameterBinaryTree() {}
    DiameterBinaryTree(int val) { this.val = val; }
    DiameterBinaryTree(int val, DiameterBinaryTree left, DiameterBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution543 {
    public int longestPath = 0;
    public int diameterOfBinaryTree(DiameterBinaryTree root) {
        longestPath(root);
        return longestPath;
    }
    public int longestPath(DiameterBinaryTree root) {
        if (root == null) {
            return 0;
        }
        int lHeight = longestPath(root.left);
        int rHeight = longestPath(root.right);

        longestPath = Math.max(longestPath, lHeight + rHeight);

        return Math.max(lHeight, rHeight) + 1;
    }
}