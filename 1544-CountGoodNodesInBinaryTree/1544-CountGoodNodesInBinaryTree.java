// Last updated: 04/04/2026, 23:31:29
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
    public int count = 0;
    private void dfs(TreeNode root, int prevMax) {
        if(root == null) return;
        if(root.val >= prevMax) count++; 
        dfs(root.left, Math.max(root.val, prevMax));
        dfs(root.right, Math.max(root.val, prevMax));
    }
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }
}