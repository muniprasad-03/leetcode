// Last updated: 09/05/2026, 00:00:59
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
12        HashMap<TreeNode, TreeNode> parentOf = new HashMap<>();
13        boolean[] vis = new boolean[501];
14        parentOf.put(root, null);
15        Queue<TreeNode> queue = new LinkedList<>();
16        queue.offer(root);
17        while(!queue.isEmpty()) {
18            TreeNode curr = queue.poll();
19            if(curr.left != null) {
20                queue.offer(curr.left);
21                parentOf.put(curr.left, curr);
22            }
23            if(curr.right != null) {
24                queue.offer(curr.right);
25                parentOf.put(curr.right, curr);
26            }
27        }
28        queue.offer(target);
29        vis[target.val] = true;
30        for(int i=0;i<k;i++) {
31            int size = queue.size();
32            while(size-- > 0) {
33                TreeNode curr = queue.poll();
34                if(curr.left != null && !vis[curr.left.val]) {
35                    vis[curr.left.val] = true;
36                    queue.offer(curr.left);
37                }
38                if(curr.right != null && !vis[curr.right.val]) {
39                    vis[curr.right.val] = true;
40                    queue.offer(curr.right);
41                }
42                if(parentOf.get(curr) != null && !vis[parentOf.get(curr).val]) {
43                    vis[parentOf.get(curr).val] = true;
44                    queue.offer(parentOf.get(curr));
45                }
46            }
47        }
48        List<Integer> ans = new ArrayList<>();
49        while(!queue.isEmpty()) {
50            ans.add(queue.poll().val);
51        }
52        return ans;
53    }
54}