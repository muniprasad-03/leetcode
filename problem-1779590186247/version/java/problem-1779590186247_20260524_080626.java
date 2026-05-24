// Last updated: 24/05/2026, 08:06:26
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        List<Integer> ans = new ArrayList<>();
4        int freq = 0;
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for(int num : nums) {
7            map.put(num, map.getOrDefault(num, 0) + 1);
8        }
9        for(int key : map.keySet()) {
10            for(int f = 0; f < map.get(key) && f < k; f++) {
11                ans.add(key);
12            }
13        }
14        Collections.sort(ans);
15        int[] ansArr = new int[ans.size()];
16        for(int i = 0; i < ans.size(); i++) {
17            ansArr[i] = ans.get(i);
18        }
19        return ansArr;
20    } 
21}