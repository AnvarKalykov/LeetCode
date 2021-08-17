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

class Solution112 {
    public boolean hasPathSum(PathSum root, int targetSum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        } else {
            return hasPathSum(root.left,targetSum - root.val)||hasPathSum(root.right,targetSum - root.val);
        }
    }
}