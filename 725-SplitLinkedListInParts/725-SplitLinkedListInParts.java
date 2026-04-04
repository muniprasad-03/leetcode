// Last updated: 04/04/2026, 23:33:21
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
    public int length(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null) {
            len++;
            temp=temp.next;
        }
        return len;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = length(head);
        int eqParts = len/k;
        int remNodes = len%k;
        ListNode[] ans = new ListNode[k];
        ListNode temp = head;
        int idx = 0;
        while(temp!=null) {
            ListNode currHead = temp;
            for(int i=1;i<eqParts && temp!=null ;i++) {
                temp = temp.next;
            }
            if(remNodes>0 && eqParts!=0 && temp!=null) {
                temp = temp.next;
                remNodes--;
            }
            ans[idx++] = currHead;
            if(temp==null) break;
            ListNode nextNode = temp.next;
            temp.next = null;
            temp = nextNode;
        }
        return ans;
    }
}