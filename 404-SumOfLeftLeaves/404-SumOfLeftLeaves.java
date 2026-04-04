// Last updated: 04/04/2026, 23:34:36
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
    private int ans = 0;
    private boolean isLeafNode(TreeNode root) {
        return (root!=null && root.left==null && root.right==null);
    }
    private void help(TreeNode root) {
        if(root == null) return ;
        if(isLeafNode(root.left)) {
            ans += root.left.val;
        }
        help(root.left);
        help(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        help(root);
        return ans;
    }
}