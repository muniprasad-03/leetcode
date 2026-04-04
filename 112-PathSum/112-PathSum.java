// Last updated: 04/04/2026, 23:37:07
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
    public void help(TreeNode root,int curr,int target,boolean[] ans) {
        if(root==null) {
            return;
        }
        curr+=root.val;
        if(root.left==null && root.right==null) {
            if(curr==target)
            ans[0] = true;
            return;
        }
        help(root.left,curr,target,ans);
        help(root.right,curr,target,ans);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        boolean[] ans = new boolean[1];
        help(root,0,targetSum,ans);
        return ans[0];
    }
}