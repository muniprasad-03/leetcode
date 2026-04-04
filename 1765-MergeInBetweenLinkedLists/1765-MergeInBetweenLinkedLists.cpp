// Last updated: 04/04/2026, 23:31:08
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
    ListNode* mergeInBetween(ListNode* list1, int a, int b, ListNode* list2) {
        ListNode* temp1=list1;
        int i=0;
        while(i<a-1 && temp1)
        {
            temp1=temp1->next;
            i++;
        }
        ListNode* Next=temp1->next;
        temp1->next=list2;
        ListNode* del;
        while(i<b && Next!=NULL)
        {
            i++;
            cout<<Next->val<<endl;
            del=Next;
            Next=Next->next;
            delete del;
        }
        while(temp1->next!=NULL)
        {
            temp1=temp1->next;
        }
        temp1->next=Next;
        return list1;
    }
};