// Last updated: 05/05/2026, 10:29:28
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
12    public ListNode rotateRight(ListNode head, int k) {
13        int len = 0;
14        ListNode temp = head;
15        while(temp != null) {
16            len++;
17            temp = temp.next;
18        }
19        if(len <= 1) return head;
20        k = k % len;
21        if(k == 0) return head;
22        temp = head;
23        for(int i=0;i<len-k-1;i++) {
24            temp = temp.next;
25        }
26        System.out.println(temp.val);
27        ListNode newHead = temp.next;
28        temp.next = null;
29        temp = newHead;
30        while(temp.next != null) {
31            temp = temp.next;
32        }
33        temp.next = head;
34        return newHead;
35    }
36}