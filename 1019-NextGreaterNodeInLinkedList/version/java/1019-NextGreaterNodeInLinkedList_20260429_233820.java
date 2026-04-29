// Last updated: 29/04/2026, 23:38:20
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
    public int[] nextLargerNodes(ListNode head) {
        int k = 0;
        int len = 0;
        ListNode temp = head;
        
        // Calculate length
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        int[] res = new int[len];
        temp = head;
        
        while(temp != null) {
            int m = 0;
            ListNode t = temp.next;
            
            // Find next larger value
            while(t != null) {
                if(t.val > temp.val) {
                    m = t.val;
                    break;
                }
                t = t.next;
            }
            
            if(m == 0) {
                res[k++] = 0;
            } else {
                res[k++] = m;
            }
            temp = temp.next;
        }
        return res;
    }
}