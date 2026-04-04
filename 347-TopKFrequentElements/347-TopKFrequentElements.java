// Last updated: 04/04/2026, 23:34:49
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        List<Integer>[] frqBuckets = new ArrayList[n+1];
        for(int num : map.keySet()) {
            int frq = map.get(num);
            if(frqBuckets[frq]==null) {
                List<Integer> arr = new ArrayList<>();
                arr.add(num);
                frqBuckets[frq] = arr;
            } else {
                frqBuckets[frq].add(num);
            }
        }
        List<Integer> ansList = new ArrayList<>();
        for(int i=n;i>=1 && ansList.size()<k ;i--) {
            if(frqBuckets[i]!=null) {
                for(int num : frqBuckets[i]) {
                    ansList.add(num);
                    if(ansList.size()==k) break;
                }
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}