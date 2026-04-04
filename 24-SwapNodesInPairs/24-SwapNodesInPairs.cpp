// Last updated: 04/04/2026, 23:38:42
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
    ListNode* swapPairs(ListNode* head) {
        if(head==NULL || head->next==NULL) return head;
        else
        {
            ListNode* temp=head;
            while(true)
            {
                if(temp!=NULL && temp->next!=NULL)
                {
                    swap(temp->val,temp->next->val);
                }
                else
                {
                    return head;
                }
                temp=temp->next->next;
            }
        }
    }
};