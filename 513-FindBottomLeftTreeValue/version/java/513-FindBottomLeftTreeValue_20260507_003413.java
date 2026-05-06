// Last updated: 07/05/2026, 00:34:13
import java.util.*;

class Solution {
    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int ans = root.val;

        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i = 0; i < size; i++){

                TreeNode node = queue.poll();

                // first node of level
                if(i == 0){
                    ans = node.val;
                }

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }

        return ans;
    }
}