package easy;

public class SubtreeAnotherTree {
    int val;
    SubtreeAnotherTree left;
    SubtreeAnotherTree right;
    SubtreeAnotherTree() {}
    SubtreeAnotherTree(int val) { this.val = val; }
    SubtreeAnotherTree(int val, SubtreeAnotherTree left, SubtreeAnotherTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(areSame(root,subRoot)){
            return true;
        }else{
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
    }
    public boolean areSame(TreeNode curr,TreeNode subRoot){
        if(curr==null && subRoot==null){
            return true;
        }else if(curr==null || subRoot==null){
            return false;
        }else{
            if(curr.val!=subRoot.val){
                return false;
            }
            return areSame(curr.left, subRoot.left) && areSame(curr.right, subRoot.right);
        }
    }
}