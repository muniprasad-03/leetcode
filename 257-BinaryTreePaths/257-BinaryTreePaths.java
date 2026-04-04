// Last updated: 04/04/2026, 23:35:17
class Solution {
    public void help(TreeNode root, StringBuilder path, List<String> ans) {
        if (root == null) return;
        path.append(root.val);
        if (root.left == null && root.right == null) {
            ans.add(path.toString());
        } else {
            path.append("->");
            help(root.left, path, ans);
            help(root.right, path, ans);
        }
        int len = String.valueOf(root.val).length();
        if (root.left!=null || root.right!=null) {
            path.delete(path.length()-len-2, path.length());
        } else {
            path.delete(path.length()-len, path.length());
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        help(root, new StringBuilder(), ans);
        return ans;
    }
}
