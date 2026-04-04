// Last updated: 04/04/2026, 23:36:42
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for(ListNode i=head; i != null; i=i.next) {
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}