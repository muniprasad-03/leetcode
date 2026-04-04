// Last updated: 04/04/2026, 23:38:57
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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp1=head;int i=0;
        while(i<n && temp1->next!=NULL)
        {
            i++;
            temp1=temp1->next;
            cout<<"i = "<<i<<" data : "<<temp1->val<<endl;        
        }
        if(temp1->next==NULL && i==n-1) return head->next;
        ListNode* temp2=head;
        while(temp1->next!=NULL)
        {
            temp1=temp1->next;
            temp2=temp2->next;
        }
        ListNode* del=temp2->next;
        temp2->next=del->next;
        delete del;
        return head;
    }
};