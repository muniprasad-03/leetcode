// Last updated: 04/04/2026, 23:28:11
class Solution {
    private static class UnionFind {
        private int[] par;
        public UnionFind(int n) {
            par=new int[n];
            for(int i=0;i<n;i++) par[i]=i;
        }
        public int find(int x) {
            if(par[x]!=x) par[x]=find(par[x]);
            return par[x];
        }
        public void union(int x,int y) {
            int rootX=find(x);
            int rootY=find(y);
            if(rootX!=rootY) par[rootX]=rootY;
        }
    }
    public long maxAlternatingSum(int[] nums, int[][] swaps) {
        int n=nums.length;
        UnionFind uf=new UnionFind(n);
        for(int[] swap:swaps){
            uf.union(swap[0],swap[1]);
        }
        Map<Integer,List<Integer>> compIdx=new HashMap<>();
        Map<Integer,PriorityQueue<Integer>> compVals=new HashMap<>();
        for(int i=0;i<n;i++) {
            int root=uf.find(i);
            compIdx.computeIfAbsent(root,k->new ArrayList<>()).add(i);
            compVals.computeIfAbsent(root,k->new PriorityQueue<>(Collections.reverseOrder())).offer(nums[i]);
        }
        long totMaxSum=0;
        for(int root:compIdx.keySet()) {
            List<Integer> idx = compIdx.get(root);
            PriorityQueue<Integer> vals = compVals.get(root);
            int evenCnt = 0;
            for (int i : idx) {
                if (i % 2 == 0) evenCnt++;
            }
            int oddCnt = idx.size() - evenCnt;
            for(int i=0;i<evenCnt;i++){
                totMaxSum+=vals.poll();
            }
            for(int i=0;i<oddCnt;i++) {
                totMaxSum-=vals.poll();
            }
        }
        return totMaxSum;
    }
}