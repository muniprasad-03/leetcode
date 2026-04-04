// Last updated: 04/04/2026, 23:33:47
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
    private int dfs(TreeNode root) {
        if(root==null) return 0;
        int lh = dfs(root.left);
        int rh = dfs(root.right);
        ans = Math.max(ans,lh+rh);
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }
}