// Last updated: 04/04/2026, 23:33:38
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
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val != root2.val) return false;
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right, root2.right);
    }
    public boolean dfs(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) {
            return false;
        }
        if(root.val == subRoot.val && isSameTree(root, subRoot)) {
            return true;
        }
        return dfs(root.left, subRoot) || dfs(root.right, subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root, subRoot);
    }
}