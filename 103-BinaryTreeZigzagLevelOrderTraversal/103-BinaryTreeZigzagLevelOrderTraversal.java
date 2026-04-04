// Last updated: 04/04/2026, 23:37:18
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        while (!q.isEmpty()) {
            int levSize = q.size();
            Deque<Integer> levListDeque = new LinkedList<>();
            for (int i = 0; i < levSize; i++) {
                TreeNode curr = q.poll();
                if (level % 2 == 1) {
                    levListDeque.offerLast(curr.val);
                } else {
                    levListDeque.offerFirst(curr.val);
                }
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.add(new ArrayList<>(levListDeque));
            level++;
        }
        return ans;
    }
}

