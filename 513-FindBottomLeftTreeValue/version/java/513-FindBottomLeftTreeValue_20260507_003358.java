// Last updated: 07/05/2026, 00:33:58
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int level = -1;
18    int ans = 0;
19    public void solve(TreeNode root, int height) {
20        if(root == null) return;
21        if(level < height) {
22            level = height;
23            ans = root.val;
24        }
25        solve(root.left, height+1);
26        solve(root.right, height+1);
27    }
28    public int findBottomLeftValue(TreeNode root) {
29        solve(root, 0);
30        return ans;
31    }
32}