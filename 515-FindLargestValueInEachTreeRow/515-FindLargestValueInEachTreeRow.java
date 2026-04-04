// Last updated: 04/04/2026, 23:33:59
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
    public List<Integer> largestValues(TreeNode root) {
      List<Integer> ans = new ArrayList<>();
      if(root==null) return ans;
      Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()) {
        TreeNode temp;
        int levelLen = q.size();
        int levMax = Integer.MIN_VALUE;
        for(int i=0;i<levelLen;i++) {
          temp = q.poll();
          if(levMax < temp.val) levMax = temp.val;
          if(temp.left!=null) {
            q.offer(temp.left);
          }
          if(temp.right!=null) {
            q.offer(temp.right);
          }
        }
        ans.add(levMax);
      }
      return ans;
    }
}