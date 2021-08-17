package easy;

public class PathSum {
    int val;
    PathSum left;
    PathSum right;
    PathSum() {}
    PathSum(int val) { this.val = val; }
    PathSum(int val, PathSum left, PathSum right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean hasPathSum(PathSum root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                return true;
            } else {
                return false;
            }
        } return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}