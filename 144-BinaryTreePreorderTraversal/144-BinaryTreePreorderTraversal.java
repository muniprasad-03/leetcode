// Last updated: 04/04/2026, 23:36:37
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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(true) {
            while(curr != null) {
                st.add(curr);
                ans.add(curr.val);
                curr = curr.left;
            }
            if(st.isEmpty()) break;
            TreeNode top = st.pop();
            curr = top.right;
        }
        return ans;
    }
}