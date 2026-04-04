// Last updated: 04/04/2026, 23:33:11
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int levSize = queue.size();
            List<Integer> levList = new ArrayList<>();
            for(int i=0;i<levSize;i++) {
                Node curr = queue.poll();
                levList.add(curr.val);
                queue.addAll(curr.children);
            }
            ans.add(levList);
        }
        return ans;
    }
}