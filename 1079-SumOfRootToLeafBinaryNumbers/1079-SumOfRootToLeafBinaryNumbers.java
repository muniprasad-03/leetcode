// Last updated: 04/04/2026, 23:32:08
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
    public int sum = 0;
    private void dfs(TreeNode root, StringBuilder str) {
        if(root == null) return ;
        str.append(root.val);
        if(root.left == null && root.right == null) {
            sum += Integer.parseInt(str.toString(), 2);
        } else {
            dfs(root.left, str);
            dfs(root.right, str);
        }
        str.deleteCharAt(str.length()-1);
    }
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return sum;
    }
}