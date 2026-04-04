// Last updated: 04/04/2026, 23:34:33
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
    int ans = 0;
    bool isLeafNode(TreeNode* root) {
        return (root!=NULL && root->left==NULL && root->right==NULL);
    }
    void help(TreeNode* root) {
        if(root == NULL) return ;
        if(isLeafNode(root->left)) {
            ans += root->left->val;
        }
        help(root->left);
        help(root->right);
    }
public:
    int sumOfLeftLeaves(TreeNode* root) {
        help(root);
        return ans;
    }
};