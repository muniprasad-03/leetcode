// Last updated: 04/04/2026, 23:34:17
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
    public ListNode listify(ListNode l,Stack<Integer> s) {
        ListNode temp = l;
        while(temp != null && temp.next!=null) {
            temp.val = s.pop();
            temp = temp.next;
        }
        temp.val = s.pop();
        if(!s.isEmpty()) temp.next = new ListNode(s.pop());
        return l;
    }
    public void stackify(ListNode l,Stack<Integer> s) {
        ListNode temp = l;
        while(temp!=null) {
            s.push(temp.val);
            temp = temp.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> n1 = new Stack<>();
        Stack<Integer> n2 = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        stackify(l1,n1);
        stackify(l2,n2);
        ListNode res = n1.size() > n2.size() ? l1 : l2 ;
        int sum = 0;
        int carry = 0;
        while((!n1.isEmpty()) && (!n2.isEmpty())) {
            sum = carry + n1.pop() + n2.pop() ;
            ans.push(sum%10);
            carry = sum/10;
        }
        while(!n1.isEmpty()) {
            sum = carry + n1.pop();
            ans.push(sum%10);
            carry = sum/10;
        }
        while(!n2.isEmpty()) {
            sum = carry + n2.pop();
            ans.push(sum%10);
            carry = sum/10;
        }
        if(carry!=0) ans.push(carry);
        return listify(res,ans);
    }
}