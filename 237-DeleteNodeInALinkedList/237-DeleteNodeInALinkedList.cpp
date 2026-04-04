// Last updated: 04/04/2026, 23:35:28
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        if(node==NULL || node->next==NULL)
        {
            node=NULL;
        }
        else
        {
            node->val=node->next->val;
            node->next=node->next->next;
        }
    }
};