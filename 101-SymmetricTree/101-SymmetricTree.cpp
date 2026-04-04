// Last updated: 04/04/2026, 23:37:22
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
public:
    bool help(TreeNode* leftTree , TreeNode* rightTree) {
        if(leftTree==NULL && rightTree == NULL) return true;
        if((leftTree==NULL && rightTree!=NULL) ||
           (leftTree!=NULL && rightTree==NULL) ||
           (leftTree->val != rightTree->val)
        ) return false;
        return (help(leftTree->left , rightTree->right) && help(leftTree->right , rightTree->left));
    }
    bool isSymmetric(TreeNode* root) {
        return help(root,root);
    }
};