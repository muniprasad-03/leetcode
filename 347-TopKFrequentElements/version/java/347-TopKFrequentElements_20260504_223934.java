// Last updated: 04/05/2026, 22:39:34
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for(int num : nums) {
5            map.put(num, map.getOrDefault(num, 0)+1);
6        }
7        List<Integer> keys = new ArrayList<>(map.keySet());
8        Collections.sort(keys, (a, b) -> Integer.compare(map.get(b), map.get(a)));
9        int[] ans = new int[k];
10        for(int i=0;i<k;i++) {
11            ans[i] = keys.get(i);
12        }
13        return ans;
14    }
15}