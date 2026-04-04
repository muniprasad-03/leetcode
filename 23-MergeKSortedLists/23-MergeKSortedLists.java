// Last updated: 04/04/2026, 23:38:45
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b) -> a.val - b.val
        );
        for(ListNode node : lists) {
            if(node!=null) pq.offer(node);
        }
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while(!pq.isEmpty()) {
            ListNode small = pq.poll();
            p.next = small;
            p = p.next;
            if(small.next != null) pq.offer(small.next);
        }
        return dummy.next;
    }
}