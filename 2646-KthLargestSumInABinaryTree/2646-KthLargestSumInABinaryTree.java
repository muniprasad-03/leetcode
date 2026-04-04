// Last updated: 04/04/2026, 23:29:59
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int levSize = queue.size();
            long levSum = 0;
            for(int i=0;i<levSize;i++) {
                TreeNode node = queue.poll();
                levSum += (long)node.val;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            minHeap.offer(levSum);
            if(minHeap.size() > k) minHeap.poll();
        }
        return minHeap.size()<k ? -1 : minHeap.peek();
    }
}