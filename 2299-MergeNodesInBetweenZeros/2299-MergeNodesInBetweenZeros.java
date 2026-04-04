// Last updated: 04/04/2026, 23:30:25
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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null) {
            while(temp.next.val!=0) {
                temp.val += temp.next.val;
                temp.next = temp.next.next;
            }
            if(temp.next.next==null) {
                temp.next = temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}