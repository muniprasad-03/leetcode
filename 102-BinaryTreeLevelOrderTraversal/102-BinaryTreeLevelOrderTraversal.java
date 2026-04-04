// Last updated: 04/04/2026, 23:37:20
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
    private void dfs(TreeNode root,int lev,List<List<Integer>> ans) {
        if(root==null) return;
        if(ans.size()==lev) ans.add(new ArrayList());
        ans.get(lev).add(root.val);
        dfs(root.left,lev+1,ans);
        dfs(root.right,lev+1,ans);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root,0,ans);
        System.gc();
        return ans;
    }
}