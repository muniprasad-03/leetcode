// Last updated: 04/04/2026, 23:30:09
/**
*Definition for a binary tree node.
*public class TreeNode {
*    int val;
*    TreeNode left;
*    TreeNode right;
*    TreeNode() {}
*    TreeNode(int val) { this.val=val;}
*    TreeNode(int val, TreeNode left, TreeNode right) {
*        this.val=val;
*        this.left=left;
*        this.right=right;
*    }
*}
 */
class Solution {
    public void reverse(TreeNode[] levList) {
        int start=0, end=levList.length-1;
        while (start<end) {
            int a=levList[start].val, b=levList[end].val;
            levList[start++].val=b;
            levList[end--].val=a;
        }
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        int levNo=0;
        TreeNode[] levList=new TreeNode[] { root };
        while (levList.length>0 && levList[0].left!= null) {
            int n=levList.length*2;
            TreeNode[] nxt=new TreeNode[n];
            for (int i=0;i<levList.length;i++) {
                nxt[2*i]=levList[i].left;
                nxt[2*i+1]=levList[i].right;
            }
            if ((levNo+1)%2==1) reverse(nxt);
            levList=nxt;
            levNo++;
        }
        return root;
    }
}

