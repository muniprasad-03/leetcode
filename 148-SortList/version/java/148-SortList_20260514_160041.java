// Last updated: 14/05/2026, 16:00:41
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
12    ListNode findMiddle(ListNode head) {
13        ListNode slow = head;
14        ListNode fast = head.next;
15        while(fast != null && fast.next != null) {
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        return slow;
20    }
21    ListNode merge(ListNode left, ListNode right) {
22        ListNode dummy = new ListNode(-1);
23        ListNode temp = dummy;
24        while(left != null || right != null) {
25            if(left == null) {
26                temp.next = new ListNode(right.val);
27                right = right.next;
28            } else if(right == null) {
29                temp.next = new ListNode(left.val);
30                left = left.next;
31            } else if(left.val <= right.val) {
32                temp.next = new ListNode(left.val);
33                left = left.next;
34            } else {
35                temp.next = new ListNode(right.val);
36                right = right.next;
37            }
38            temp = temp.next;
39        }
40        return dummy.next;
41    }
42    public ListNode sortList(ListNode head) {
43        if(head == null || head.next == null) return head;
44        ListNode midNode = findMiddle(head);
45        ListNode leftHead = head;
46        ListNode rightHead = midNode.next;
47        midNode.next = null;
48        ListNode leftPart = sortList(leftHead);
49        ListNode rightPart = sortList(rightHead);
50        return merge(leftPart, rightPart);
51    }
52}