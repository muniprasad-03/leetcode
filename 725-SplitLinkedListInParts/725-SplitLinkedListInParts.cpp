// Last updated: 04/04/2026, 23:33:17
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
    int length(ListNode* head) {
        int len = 0;
        ListNode* temp = head;
        while(temp!=NULL) {
            len++;
            temp=temp->next;
        }
        return len;
    }
    vector<ListNode*> splitListToParts(ListNode* head, int k) {
        int len = length(head);
        int eqParts = len/k;
        int remNodes = len%k;
        vector<ListNode*> ans(k);
        ListNode* temp = head;
        int idx = 0;
        while(temp!=NULL) {
            ListNode* currHead = temp;
            for(int i=1;i<eqParts && temp!=NULL ;i++) {
                temp = temp->next;
            }
            if(remNodes>0 && eqParts!=0 && temp!=NULL) {
                temp = temp->next;
                remNodes--;
            }
            ans[idx++] = currHead;
            if(temp==NULL) break;
            ListNode* nextNode = temp->next;
            temp->next = NULL;
            temp = nextNode;
        }
        return ans;
    }
};