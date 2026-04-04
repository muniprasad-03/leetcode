// Last updated: 04/04/2026, 23:36:04
import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levSize = queue.size();
            TreeNode curr = null;
            for (int i = 0; i < levSize; i++) {
                curr = queue.poll();
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            ans.add(curr.val);
        }
        return ans;
    }
}
