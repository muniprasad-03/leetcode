// Last updated: 04/04/2026, 23:37:09
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
    void help(TreeNode* root,int sum,vector<int> &curr,vector<vector<int>> &ans,int tar) {
        if(root==NULL) return;
        curr.push_back(root->val);
        sum+=root->val;
        if(root->left==NULL && root->right==NULL) {
            if(sum==tar) {
                ans.push_back(curr);
            }
        } else {
            help(root->left,sum,curr,ans,tar);
            help(root->right,sum,curr,ans,tar);
        }
        curr.pop_back();
    }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> ans;
        vector<int> curr;
        help(root,0,curr,ans,targetSum);
        return ans;
    }
};