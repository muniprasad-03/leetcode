// Last updated: 04/04/2026, 23:36:38
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
    public ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = slow.next;
        while(!(fast==null || fast.next==null)) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public void merge(ListNode first,ListNode second) {
        ListNode h1,h2;
        while(first!=null && second!=null) {
            h1=first.next;
            h2=second.next;
            first.next=second;
            second.next=h1;
            first=h1;
            second=h2;
        }
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return;
        ListNode mid = midNode(head);
        ListNode x = mid.next;
        mid.next = null;
        mid = x;
        ListNode secondHalf = reverse(mid);
        merge(head,secondHalf);
    }
}