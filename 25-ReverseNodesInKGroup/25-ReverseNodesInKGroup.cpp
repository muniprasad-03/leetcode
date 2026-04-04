// Last updated: 04/04/2026, 23:38:41
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
    ListNode* Reverse(ListNode* head)
    {
        ListNode* curr=head;
        ListNode* prev=NULL;
        ListNode* front=NULL;
        while(curr!=NULL)
        {
            front=curr->next;
            curr->next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
    ListNode* KthNode(ListNode* head,int k)
    {
        ListNode* temp=head;
        for(int i=1;i<k && temp!=NULL;i++)
        {
            temp=temp->next;
        }
        return temp;
    }
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* temp=head;
        ListNode* Prev=NULL;
        while(temp!=NULL)
        {
            ListNode* Knode=KthNode(temp,k);
            if(Knode==NULL)
            {
                if(Prev==NULL) return head;
                else
                {
                    Prev->next=temp;
                    break;
                }
            }
            ListNode* Next=Knode->next;
            Knode->next=NULL;
            ListNode* temphead=Reverse(temp);
            if(temp==head)
            {
                head=temphead;
            }
            else
            {
                Prev->next=temphead;
            }
            Prev=temp;
            temp=Next;
        }
        return head;
    }
};