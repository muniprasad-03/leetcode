// Last updated: 04/05/2026, 22:48:24
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        int n = nums.length;
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for(int num : nums) {
6            map.put(num, map.getOrDefault(num, 0)+1);
7        }
8        List<Integer>[] freqBuckets = new ArrayList[n+1];
9        for(int key : map.keySet()) {
10            int val = map.get(key);
11            if(freqBuckets[val] == null) {
12                freqBuckets[val] = new ArrayList<>();
13            }
14            freqBuckets[val].add(key);
15        }
16        int[] ans = new int[k];
17        int idx = 0;
18        for(int i=n;i>=0 && idx < k;i--) {
19            if(freqBuckets[i] != null) {
20                for(int num : freqBuckets[i]) {
21                    ans[idx++] = num;
22                    if(idx == k) break;
23                }
24            }
25        }
26        return ans;
27    }
28}