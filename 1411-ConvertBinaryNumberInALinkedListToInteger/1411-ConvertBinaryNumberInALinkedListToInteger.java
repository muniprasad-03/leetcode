// Last updated: 04/04/2026, 23:31:43
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
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode temp = head;
        while(temp != null){
            result = (result << 1) | temp.val;
            temp = temp.next;
        }
        return result;
    }
}