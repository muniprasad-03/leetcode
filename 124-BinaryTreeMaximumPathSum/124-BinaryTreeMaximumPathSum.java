// Last updated: 04/04/2026, 23:36:54
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int ans = Integer.MIN_VALUE;
    private int help(TreeNode root) {
        if(root==null) return 0;
        int leftCost = Math.max(0, help(root.left));
        int rightCost = Math.max(0, help(root.right));
        ans = Math.max(ans,leftCost+rightCost+root.val);
        return root.val + Math.max(leftCost,rightCost);
    }
    public int maxPathSum(TreeNode root) {
        help(root);
        System.gc();
        return ans;
    }
}