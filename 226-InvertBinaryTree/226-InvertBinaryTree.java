// Last updated: 04/04/2026, 23:35:37
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
    private TreeNode dfs(TreeNode root) {
        if(root==null) return null;
        TreeNode leftNode = dfs(root.left);
        TreeNode rightNode = dfs(root.right);
        root.left = rightNode;
        root.right = leftNode;
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }
}