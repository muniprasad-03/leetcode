// Last updated: 04/04/2026, 23:37:38
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummyNode = new ListNode(-1000);
        dummyNode.next = head;
        head = dummyNode;
        ListNode front = head.next;
        ListNode prev = head;
        while(front!=null) {
            while(front.next!=null && front.val==front.next.val) {
                front = front.next;
            }
            if (prev.next == front) {
                prev = prev.next;
            } else {
                prev.next = front.next;
            } 
            front = front.next;
        }
        return dummyNode.next;
    }
}