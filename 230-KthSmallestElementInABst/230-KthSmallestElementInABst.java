// Last updated: 04/04/2026, 23:35:32
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
    public int idx = 0;
    private int k;
    private int ans;
    private void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        ++idx;
        if(idx == k) {
            ans = root.val;
            return;
        }
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        inorder(root);
        return ans;
    }
}