// Last updated: 04/04/2026, 23:37:25
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
    bool helper(TreeNode* root,long minLim,long maxLim) {
        if(root==NULL) return true;
        if(root->val<=minLim || root->val>=maxLim) return false;
        return helper(root->left,minLim,root->val) && helper(root->right,root->val,maxLim);
        // For Left SubTree The root->val becomes the maximum Limit 
        // For Right SubTree The root->val becomes the minimum Limit
    }
    bool isValidBST(TreeNode* root) {
        return helper(root,LONG_MIN,LONG_MAX);
    }
};