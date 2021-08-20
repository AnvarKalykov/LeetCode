package easy;

public class MaximumDepthBinaryTree {
    int val;
    MaximumDepthBinaryTree left;
    MaximumDepthBinaryTree right;
    MaximumDepthBinaryTree() {}
    MaximumDepthBinaryTree(int val) { this.val = val; }
    MaximumDepthBinaryTree(int val, MaximumDepthBinaryTree left, MaximumDepthBinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
}
}

class Solution104 {
    public int maxDepth(MaximumDepthBinaryTree root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}