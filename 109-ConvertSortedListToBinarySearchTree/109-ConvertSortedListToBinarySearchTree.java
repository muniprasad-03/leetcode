// Last updated: 04/04/2026, 23:37:16
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private ListNode findMid(ListNode node) {
        if(node == null) return null;
        ListNode prev = null;
        ListNode slow = node;
        ListNode fast = node;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null) prev.next = null;
        return slow;
    }
    private TreeNode helper(ListNode node) {
        if(node == null) return null;

        ListNode midNode = findMid(node);
        TreeNode curr = new TreeNode(midNode.val);
        if(midNode == node) return curr;
        
        curr.left = helper(node);
        curr.right = helper(midNode.next);
        return curr;
    }
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head);
    }
}