// Last updated: 14/05/2026, 16:04:49
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
    public ListNode sortList(ListNode head) {
         if( head == null || head.next == null) return head;

        ListNode mid = getMidNode(head);
        ListNode midNext = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        
        return merge(left, right);
    }

    public ListNode getMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
     }

     public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode t = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                t.next = left;
                left = left.next;
            }else{
                t.next = right;
                right = right.next;
            }
            t = t.next;
        }
        if(left == null) t.next = right;
        else t.next = left;

        return dummy.next;
     }
}