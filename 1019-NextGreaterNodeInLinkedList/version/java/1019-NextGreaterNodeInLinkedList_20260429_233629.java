// Last updated: 29/04/2026, 23:36:29
class Solution {
      int n =0;
    public int[] nextLargerNodes(ListNode head) {

          ListNode prev = null , curr = head;
        n = 0; // Reset count
        while(curr!=null){
            ListNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr =agla;
            n++;
        }
       ListNode curr1 = prev;
       int[] nge = new int[n];

       int[] st = new int[n];

       int top=-1;

       for(int i=n-1;i>=0;i--){

        while(top>-1 && curr1.val>=st[top])  top--;

        nge[i] = (top==-1) ? 0 : st[top];

        st[++top] = curr1.val; 

        curr1 = curr1.next;

       }
       return nge;
    }

}