// Last updated: 04/04/2026, 23:32:06
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
    private List<Integer> levSums;
    private void dfs(TreeNode root, int levNum) {
        if(root == null) return;
        if(levSums.size() == levNum) {
            levSums.add(root.val);
        } else {
            levSums.set(levNum, levSums.get(levNum)+root.val);
        }
        dfs(root.left, levNum+1);
        dfs(root.right, levNum+1);
    }
    public int maxLevelSum(TreeNode root) {
        levSums = new ArrayList<>();
        dfs(root, 0);
        int ans = 0;
        int maxSum = levSums.get(0);
        for(int i=0;i<levSums.size();i++) {
            if(maxSum < levSums.get(i)) {
                ans = i;
                maxSum = levSums.get(i);
            }
        }
        return ans+1;
    }
}