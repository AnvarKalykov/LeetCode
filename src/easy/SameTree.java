package easy;

class SameTree {
    int val;
    SameTree left;
    SameTree right;
    SameTree() {}
    SameTree(int val) { this.val = val; }
    SameTree(int val, SameTree left, SameTree right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
}

class Solution {
    public boolean isSameTree(SameTree p, SameTree q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean t = true;
        t = t && isSameTree(p.left, q.left);
        t = t && isSameTree(p.right, q.right);

        return t;
    }
}