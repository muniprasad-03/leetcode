// Last updated: 04/04/2026, 23:39:13
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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* temp1=l1;
        ListNode* temp2=l2;
        ListNode* dummyNode=new ListNode(-1);
        ListNode* move=dummyNode;
        int sum=0,carry=0;
        while(temp1!=NULL || temp2!=NULL)
        {
            sum=sum+carry;
            if(temp1!=NULL) 
            {
                sum=sum+temp1->val;
                temp1=temp1->next;
            }
            if(temp2!=NULL) 
            {
                sum=sum+temp2->val;
                temp2=temp2->next;
            }
            move->next=new ListNode(sum%10);
            move=move->next;
            carry=sum/10;
            sum=0;
        }
        if(carry!=0)
        {
            move->next=new ListNode(carry);
            move=move->next;
        }
        return dummyNode->next;
    }
};