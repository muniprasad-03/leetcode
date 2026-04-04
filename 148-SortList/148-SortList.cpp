// Last updated: 04/04/2026, 23:36:29
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
    ListNode* findMiddle(ListNode* head)
    {
        ListNode* slow=head;
        ListNode* fast=head->next;
        while(fast->next!=NULL)
        {
            slow=slow->next;
            fast=fast->next;
            if(fast->next!=NULL)
            {
                fast=fast->next;
            }
        }
        return slow;
    }
    ListNode* Merge(ListNode* left,ListNode* right)
    {
        ListNode* dummy=new ListNode(0);
        ListNode* temp=dummy;
        while(left!=NULL && right!=NULL)
        {
            if(left->val<right->val)
            {
                dummy->next=new ListNode(left->val);
                left=left->next;
            }
            else
            {
                dummy->next=new ListNode(right->val);
                right=right->next;
            }
            dummy=dummy->next;
        }
        while(left!=NULL)
        {
            dummy->next=new ListNode(left->val);
            dummy=dummy->next;
            left=left->next;
        }
        while(right!=NULL)
        {
            dummy->next=new ListNode(right->val);
            dummy=dummy->next;
            right=right->next;
        }
        return temp->next;
    }
    ListNode* sortList(ListNode* head) {
    if(head==NULL || head->next==NULL)
	{
		return head;
	}
	ListNode* mid=findMiddle(head);
	ListNode* left=head;
	ListNode* right=mid->next;
	mid->next=NULL;
	left=sortList(left);
	right=sortList(right);
	return Merge(left,right);
    }
};