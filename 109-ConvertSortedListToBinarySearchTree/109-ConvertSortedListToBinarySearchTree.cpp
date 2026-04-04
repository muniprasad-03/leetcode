// Last updated: 04/04/2026, 23:37:12
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
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private:
    ListNode* findMid(ListNode* node) {
        if(node == NULL) return NULL;
        ListNode* prev = NULL;
        ListNode* slow = node;
        ListNode* fast = node;
        while(fast != NULL && fast->next != NULL) {
            prev = slow;
            slow = slow->next;
            fast = fast->next->next;
        }
        if(prev != NULL) prev->next = NULL;
        return slow;
    }
    TreeNode* helper(ListNode* node) {
        if(node == NULL) return NULL;

        ListNode* midNode = findMid(node);
        TreeNode* curr = new TreeNode(midNode->val);
        if(midNode == node) return curr;
        
        curr->left = helper(node);
        curr->right = helper(midNode->next);
        return curr;
    }
public:
    TreeNode* sortedListToBST(ListNode* head) {
        return helper(head);
    }
};