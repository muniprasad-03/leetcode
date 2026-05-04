// Last updated: 04/05/2026, 23:25:46
1class Solution {
2    public void wiggleSort(int[] nums) {
3        int n = nums.length;
4        int[] temp = nums.clone();
5        Arrays.sort(temp);
6        int mid = (n+1)/2;
7        int l = mid-1;
8        int r = n-1;
9        for(int i=0;i<n;i++) {
10            nums[i] = (i%2==0) ? temp[l--] : temp[r--];
11        }
12    }
13}