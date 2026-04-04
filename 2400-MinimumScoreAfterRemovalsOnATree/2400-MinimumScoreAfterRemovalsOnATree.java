// Last updated: 04/04/2026, 23:30:13
class Solution {
    private List<Integer>[] graph;
    private int[] nodeValues;
    private int[] subtreeXorSums;
    private int[] tin;
    private int[] tout;
    private int timer;
    private int totalTreeXor;
    private int minPossibleScore;

    public int minimumScore(int[] nums, int[][] edges) {
        int n = nums.length;
        this.nodeValues = nums;
        
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        subtreeXorSums = new int[n];
        tin = new int[n];
        tout = new int[n];
        timer = 0;
        minPossibleScore = Integer.MAX_VALUE;

        for (int val : nums) {
            totalTreeXor ^= val;
        }

        dfs(0, -1);

        for (int i = 0; i < n - 1; i++) {
            int nodeA1 = edges[i][0];
            int nodeB1 = edges[i][1];

            if (isAncestor(nodeB1, nodeA1)) { 
                int temp = nodeA1;
                nodeA1 = nodeB1;
                nodeB1 = temp;
            }

            for (int j = i + 1; j < n - 1; j++) {
                int nodeA2 = edges[j][0];
                int nodeB2 = edges[j][1];

                if (isAncestor(nodeB2, nodeA2)) {
                    int temp = nodeA2;
                    nodeA2 = nodeB2;
                    nodeB2 = temp;
                }

                int xorComp1, xorComp2, xorComp3;

                if (isAncestor(nodeB1, nodeB2)) {
                    xorComp1 = subtreeXorSums[nodeB2];               
                    xorComp2 = subtreeXorSums[nodeB1] ^ subtreeXorSums[nodeB2]; 
                    xorComp3 = totalTreeXor ^ subtreeXorSums[nodeB1]; 
                } else if (isAncestor(nodeB2, nodeB1)) {
                    xorComp1 = subtreeXorSums[nodeB1];               
                    xorComp2 = subtreeXorSums[nodeB2] ^ subtreeXorSums[nodeB1]; 
                    xorComp3 = totalTreeXor ^ subtreeXorSums[nodeB2]; 
                } else {
                    xorComp1 = subtreeXorSums[nodeB1];               
                    xorComp2 = subtreeXorSums[nodeB2];               
                    xorComp3 = totalTreeXor ^ subtreeXorSums[nodeB1] ^ subtreeXorSums[nodeB2]; 
                }

                int currentMaxXor = Math.max(xorComp1, Math.max(xorComp2, xorComp3));
                int currentMinXor = Math.min(xorComp1, Math.min(xorComp2, xorComp3));
                minPossibleScore = Math.min(minPossibleScore, currentMaxXor - currentMinXor);
            }
        }

        return minPossibleScore;
    }

    private void dfs(int currNode, int parentNode) {
        tin[currNode] = timer++;
        subtreeXorSums[currNode] = nodeValues[currNode];

        for (int neighbor : graph[currNode]) {
            if (neighbor == parentNode) {
                continue;
            }
            dfs(neighbor, currNode);
            subtreeXorSums[currNode] ^= subtreeXorSums[neighbor];
        }
        tout[currNode] = timer++;
    }

    private boolean isAncestor(int ancestor, int descendant) {
        return tin[ancestor] <= tin[descendant] && tout[descendant] <= tout[ancestor];
    }
}