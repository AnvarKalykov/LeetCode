package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AverageLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        if (root == res) {
            return res;
        }

        LinkedList<TreeNode> que = new LinkedList<>();

        que.addLast(root);
        while (que.size() != 0) {
            int size = que.size();
            double sm = 0.0;
            int count = 0;
            while (size --> 0) {
                TreeNode rn = que.removeFirst();
                sm = sm + rn.val;
                count++;
                if (rn.left != null) {
                    que.addLast(rn.left);

                } if (rn.right != null) {
                    que.addLast(rn.right);
                }

            }
            res.add((double) (sm / count));
        }
        return res;

    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
