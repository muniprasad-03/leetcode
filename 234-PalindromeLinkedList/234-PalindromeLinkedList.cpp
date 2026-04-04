// Last updated: 04/04/2026, 23:35:27
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
    ListNode* Reverse(ListNode* head)
    {
        ListNode* Next=NULL;
        ListNode* curr=head;
        ListNode* prev=NULL;
        while(curr!=NULL)
        {
            Next=curr->next;
            curr->next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    ListNode* Middle(ListNode* head)
    {
        ListNode* slow=head;
        ListNode* fast=head;
        while(fast!=NULL)
        {
            slow=slow->next;
            fast=fast->next;
            if(fast) fast=fast->next;
        }
        return slow;
    }
    bool isPalindrome(ListNode* head) {
        if(head==NULL) return false;
        else if(head->next==NULL) return true;
        ListNode* mid=Middle(head);
        ListNode* newhead=Reverse(mid);
        ListNode *l=head,*r=newhead;
        while(l!=NULL && r!=NULL)
        {
            if(l->val!=r->val)
            return false;
            l=l->next;
            r=r->next;
        }
        return true;
    }
};