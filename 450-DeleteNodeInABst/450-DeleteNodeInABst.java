// Last updated: 04/04/2026, 23:34:14
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private void deleteSingleNode(TreeNode parent, TreeNode curr, TreeNode child) {
        if(parent.left == curr) parent.left = child;
        else parent.right = child;
    }

    private void deleteLeafNode(TreeNode parent, TreeNode child) {
        if(parent.left == child) parent.left = null;
        else parent.right = null;
    }

    private void deleteTwoNode(TreeNode node) {
        TreeNode tempParent = node;
        TreeNode temp = node.right;
        while(temp.left != null) {
            tempParent = temp;
            temp = temp.left;
        }
        node.val = temp.val;
        if(tempParent == node) tempParent.right = temp.right;
        else tempParent.left = temp.right; 
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode curr = root;
        TreeNode parent = null;
        while(curr != null) {
            if(curr.val == key) {
                if(parent == null) {
                    if(curr.left == null) return curr.right;
                    if(curr.right == null) return curr.left;
                }
                if(curr.left == null && curr.right == null) {
                    deleteLeafNode(parent, curr);
                } else if(curr.left == null && curr.right != null) {
                    deleteSingleNode(parent, curr, curr.right);
                } else if(curr.right == null && curr.left != null) {
                    deleteSingleNode(parent, curr, curr.left);
                } else {
                    deleteTwoNode(curr);
                }
                break;
            }
            parent = curr;
            if(curr.val > key) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return root;
    }
}