// Last updated: 04/04/2026, 23:37:05
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
    public void help(TreeNode root,int sum,List<Integer> curr,List<List<Integer>> ans,int tar) {
        if(root==null) return;
        curr.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null) {
            if(sum==tar) {
                ans.add(new ArrayList<>(curr));
            }
        } else {
            help(root.left,sum,curr,ans,tar);
            help(root.right,sum,curr,ans,tar);
        }
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        help(root,0,curr,ans,targetSum);
        return ans;
    }
}