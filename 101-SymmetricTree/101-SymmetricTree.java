// Last updated: 04/04/2026, 23:37:27
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
    public boolean help(TreeNode leftTree , TreeNode rightTree) {
        if(leftTree==null && rightTree == null) return true;
        if((leftTree==null && rightTree!=null) ||
           (leftTree!=null && rightTree==null) ||
           (leftTree.val != rightTree.val)
        ) return false;
        return (help(leftTree.left , rightTree.right) && help(leftTree.right , rightTree.left));
    }
    public boolean isSymmetric(TreeNode root) {
        return help(root,root);
    }
}