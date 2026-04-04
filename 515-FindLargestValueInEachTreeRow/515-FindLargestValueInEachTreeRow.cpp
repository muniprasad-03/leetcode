// Last updated: 04/04/2026, 23:33:58
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
    vector<int> largestValues(TreeNode* root) {
    vector<int> ans;
      if(root==NULL) return ans;
      queue<TreeNode*> q;
      q.push(root);
      while(!q.empty()) {
        TreeNode* temp;
        int levelLen = q.size();
        int levMax = INT_MIN;
        for(int i=0;i<levelLen;i++) {
          temp = q.front();
          q.pop();
          if(levMax < temp->val) levMax = temp->val;
          if(temp->left!=NULL) {
            q.push(temp->left);
          }
          if(temp->right!=NULL) {
            q.push(temp->right);
          }
        }
        ans.push_back(levMax);
      }
      return ans;
    }
};