// Last updated: 04/04/2026, 23:38:03
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
    int Length(ListNode* head)
    {
        ListNode* temp=head;int len=0;
        while(temp!=0)
        {
            len++;
            temp=temp->next;
        }
        return len;
    }
    ListNode* rotateRight(ListNode* head, int k) {
        if(k==0 || head==NULL) return head;
        int len=Length(head);
        k=k%len;
        if(k==0) return head;
        ListNode* temp=head;
        for(int i=0;i<len-k-1;i++)
        {
            temp=temp->next;
        }
        ListNode* newHead=temp->next;
        temp->next=NULL;
        temp=newHead;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=head;
        return newHead;
    }
};