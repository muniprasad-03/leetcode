// Last updated: 04/04/2026, 23:37:30
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
    public boolean helper(TreeNode root,long minLim,long maxLim) {
        if(root==null) return true;
        if(root.val<=minLim || root.val>=maxLim) return false;
        return helper(root.left,minLim,root.val) && helper(root.right,root.val,maxLim);
        // For Left SubTree The root.val becomes the maximum Limit 
        // For Right SubTree The root.val becomes the minimum Limit
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}