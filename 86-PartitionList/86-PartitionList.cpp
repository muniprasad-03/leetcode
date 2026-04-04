// Last updated: 04/04/2026, 23:37:34
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode *ldummy = new ListNode(-1);
        ListNode *rdummy = new ListNode(-1);
        ListNode *p = ldummy;
        ListNode *q = rdummy;
        ListNode *temp = head;
        while(temp)
        {
            if(temp->val < x )
            {
                p->next = temp;
                p = p->next;
            }
            else
            {
                q->next = temp;
                q = q->next;
            }
            temp = temp->next;
        }
        p->next = rdummy->next;
        q->next = NULL;
        ListNode *ans = ldummy->next;
        delete ldummy;
        delete rdummy;
        return ans;
    }
};