// Last updated: 04/04/2026, 23:37:04
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][] cache=new int[n][n];
        for(int i=0;i<n;i++) {
            Arrays.fill(cache[i],Integer.MAX_VALUE / 2);
        }
        cache[0][0]=triangle.get(0).get(0);
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<=i;j++) {
                int curr=cache[i][j];
                // left
                int left=curr+triangle.get(i+1).get(j);
                cache[i+1][j]=Math.min(cache[i+1][j],left);
                // right
                int right=curr+triangle.get(i+1).get(j+1);
                cache[i+1][j+1]=Math.min(cache[i+1][j+1],right);
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int v : cache[n-1]) ans=Math.min(ans,v);
        return ans;
    }
}
