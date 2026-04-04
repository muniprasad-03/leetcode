// Last updated: 04/04/2026, 23:30:02
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
class Solution {
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode revHead = reverseLinkedList(head);
        ListNode temp = revHead;
        while(temp != null && temp.next != null) {
            if(temp.val > temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        revHead = reverseLinkedList(revHead);
        return revHead;
    }
}