// Last updated: 04/04/2026, 23:36:49
class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentNum) {
        if (node == null) return 0;
        currentNum = currentNum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return currentNum;
        }
        return dfs(node.left, currentNum) + dfs(node.right, currentNum);
    }
}
