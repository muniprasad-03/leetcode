// Last updated: 07/05/2026, 00:24:46
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
17    public int deepestLeavesSum(TreeNode root) {
18        Queue<TreeNode> queue = new LinkedList<>();
19        queue.offer(root);
20        int ans = root.val;
21        while(!queue.isEmpty()) {
22            int n = queue.size();
23            int sum = 0;
24            for(int i=0;i<n;i++) {
25                TreeNode curr = queue.poll();
26                sum += curr.val;
27                if(curr.left != null) {
28                    queue.offer(curr.left);
29                }
30                if(curr.right != null) {
31                    queue.offer(curr.right);
32                }
33            }
34            ans = sum;
35        }
36        return ans;
37    }
38}