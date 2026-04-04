// Last updated: 04/04/2026, 23:30:23
/**
 * Definition for singly-linked list->
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(NULLptr) {}
 *     ListNode(int x) : val(x), next(NULLptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeNodes(ListNode* head) {
        ListNode* temp = head;
        while(temp->next!=NULL) {
            while(temp->next->val!=0) {
                temp->val += temp->next->val;
                temp->next = temp->next->next;
            }
            if(temp->next->next==NULL) {
                temp->next = temp->next->next;
                break;
            }
            temp=temp->next;
        }
        return head;
    }
};