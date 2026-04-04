// Last updated: 04/04/2026, 23:35:59
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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* dummyNode=new ListNode(-1);
        dummyNode->next=head;
        ListNode* temp=dummyNode;
        while(temp->next!=NULL)
        {
            if(temp->next->val==val)
            {
                temp->next=temp->next->next;
            }
            else
            {
                temp=temp->next;
            }
        }
        head=dummyNode->next;
        delete dummyNode;
        return head;
    }
};