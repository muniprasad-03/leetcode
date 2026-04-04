// Last updated: 04/04/2026, 23:37:15
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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        int height = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            height++;
            int nodesAtLevel = q.size();
            for(int i=0;i<nodesAtLevel;i++) {
                TreeNode element = q.poll();
                if(element==null) continue;
                if(element.left!=null) {
                    q.offer(element.left);
                }
                if(element.right!=null) {
                    q.offer(element.right);
                }
            }
        }
        return height;
    }
}