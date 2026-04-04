// Last updated: 04/04/2026, 23:31:59
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
    private void dfs(TreeNode root, List<Integer> inorder) {
        if(root == null) return;
        dfs(root.left, inorder);
        inorder.add(root.val);
        dfs(root.right, inorder);
    }
    private TreeNode convertToTree(int start, int end, List<Integer> inorder) {
        if(start > end) return null;
        int mid = start+(end-start)/2;
        TreeNode root = new TreeNode(inorder.get(mid));
        root.left = convertToTree(start, mid-1, inorder);
        root.right = convertToTree(mid+1, end, inorder);
        return root;
        
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        dfs(root, inorder);
        root = convertToTree(0, inorder.size()-1, inorder);
        return root;
    }
}