// Last updated: 04/04/2026, 23:26:17
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] counts = new int[101];
        for(int num : nums) {
            counts[num]++;
        }
        List<Integer> unqVals = new ArrayList<>();
        for(int i=1;i<=100;i++) {
            if(counts[i] > 0) {
                unqVals.add(i);
            }
        }
        Collections.sort(unqVals);
        for(int i=0;i<unqVals.size(); i++) {
            int x = unqVals.get(i);
            int fx = counts[x];
            for(int j=i+1;j<unqVals.size();j++) {
                int y = unqVals.get(j);
                int fy = counts[y];
                if(fx != fy) return new int[]{x, y};
            } 
        }
        return new int[]{-1, -1};
    }
}