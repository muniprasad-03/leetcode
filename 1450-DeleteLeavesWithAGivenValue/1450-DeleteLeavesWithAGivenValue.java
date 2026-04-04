// Last updated: 04/04/2026, 23:31:40
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
    private boolean dfs(TreeNode root, int target) {
        if(root == null) return false;
        if(dfs(root.left, target)) {
            root.left = null;
        }
        if(dfs(root.right, target)) {
            root.right = null;
        }
        return root.left == null && root.right == null && root.val == target;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        dfs(root, target);
        if(root.left == null && root.right == null && root.val == target) return null;
        return root;
    }
}