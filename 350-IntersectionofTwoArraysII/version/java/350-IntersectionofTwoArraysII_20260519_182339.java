// Last updated: 19/05/2026, 18:23:39
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        Map<Integer, Integer> map = new HashMap<>();
4        for(int num : nums1) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6        }
7        List<Integer> list = new ArrayList<>();
8        for(int num : nums2) {
9            if(map.containsKey(num) && map.get(num) > 0) {
10                list.add(num);
11                map.put(num, map.get(num) - 1);
12            }
13        }
14        int[] ans = new int[list.size()];
15        for(int i=0;i<list.size();i++) {
16            ans[i] = list.get(i);
17        }
18        return ans;
19    }
20}