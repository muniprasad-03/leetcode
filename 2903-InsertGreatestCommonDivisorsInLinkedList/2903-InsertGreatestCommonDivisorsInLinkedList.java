// Last updated: 04/04/2026, 23:29:51
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
    private int GCD(int a, int b) {
        while( b != 0) {
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        while(ptr2 != null) {
            int a = ptr1.val;
            int b = ptr2.val;
            ListNode newNode = new ListNode(GCD(a,b));
            newNode.next = ptr1.next;
            ptr1.next = newNode;
            ptr1 = ptr2;
            ptr2 = ptr2.next;
        }
        return head;
    }
}