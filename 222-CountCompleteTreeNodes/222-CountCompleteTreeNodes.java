// Last updated: 04/04/2026, 23:35:48
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
    public void help(TreeNode root,int[] cnt) {
        if(root==null) {
            return;
        }
        cnt[0]++;
        help(root.left,cnt);
        help(root.right,cnt);
    }
    public int countNodes(TreeNode root) {
        int[] noOfNodes = new int[1];
        help(root,noOfNodes);
        return noOfNodes[0];
    }
}