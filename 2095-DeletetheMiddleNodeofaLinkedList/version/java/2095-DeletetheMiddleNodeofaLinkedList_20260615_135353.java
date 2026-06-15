// Last updated: 15/06/2026, 13:53:53
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteMiddle(ListNode head) {
13        if(head == null || head.next == null) {
14            return null;
15        }
16        ListNode slow = head;
17        ListNode fast = head.next.next;
18        while(fast != null && fast.next != null) {
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        slow.next = slow.next.next;
23        return head;
24    }
25}