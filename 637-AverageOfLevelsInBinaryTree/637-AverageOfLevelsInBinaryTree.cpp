// Last updated: 04/04/2026, 23:33:33
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
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> ans;

        queue<TreeNode*> q;
        q.push(root);
        //ans.push_back(root->val);
        while(!q.empty()){
            double sum=0;
            int l=q.size();
            for(int i=0;i<l;i++){
                TreeNode* x=q.front();
                q.pop();
                sum+=(x->val);
                if(x->left!=nullptr)    q.push(x->left);
                if(x->right!=nullptr)   q.push(x->right);
            }
            ans.push_back(sum/l);
        }
        return ans;
    }
};