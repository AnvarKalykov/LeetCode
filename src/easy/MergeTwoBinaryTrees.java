package easy;

public class MergeTwoBinaryTrees {
    int val;
    MergeTwoBinaryTrees left;
    MergeTwoBinaryTrees right;
    MergeTwoBinaryTrees() {}
    MergeTwoBinaryTrees(int val) { this.val = val; }
    MergeTwoBinaryTrees(int val, MergeTwoBinaryTrees left, MergeTwoBinaryTrees right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution617 {
    public MergeTwoBinaryTrees mergeTrees(MergeTwoBinaryTrees root1, MergeTwoBinaryTrees root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
