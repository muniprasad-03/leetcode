// Last updated: 04/04/2026, 23:31:36
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
    private static final int MOD = 1000000007;
    private long ans = 0;
    private int totalSum = 0;
    private void findTotalSum(TreeNode node) {
        if(node == null) return;
        totalSum += node.val;
        findTotalSum(node.left);
        findTotalSum(node.right);
    }
    private int dfs(TreeNode root) {
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int curr = left+right+root.val;
        ans = Math.max(ans, (long)curr*(totalSum-curr));
        return curr;
    }
    public int maxProduct(TreeNode root) {
        findTotalSum(root);
        dfs(root);
        return (int)(ans%MOD);
    }
}