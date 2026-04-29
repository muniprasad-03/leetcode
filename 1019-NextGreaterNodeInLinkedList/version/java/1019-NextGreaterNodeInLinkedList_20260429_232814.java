// Last updated: 29/04/2026, 23:28:14
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
12    public int[] nextLargerNodes(ListNode head) {
13        ArrayList<Integer> list = new ArrayList<>();
14        ListNode temp = head;
15        while(temp != null) {
16            list.add(temp.val);
17            temp = temp.next;
18        }
19        Stack<Integer> st = new Stack<>();
20        int n = list.size();
21        int[] ans = new int[n];
22        for(int i=n-1; i>=0; i--) {
23            int curr = list.get(i);
24            if(st.isEmpty()) {
25                st.push(curr);
26            }
27            while(!st.isEmpty() && curr >= st.peek()) {
28                st.pop();
29            }
30            ans[i] = st.isEmpty() ? 0 : st.peek();
31            st.push(curr);
32        }
33        return ans;
34    }
35}