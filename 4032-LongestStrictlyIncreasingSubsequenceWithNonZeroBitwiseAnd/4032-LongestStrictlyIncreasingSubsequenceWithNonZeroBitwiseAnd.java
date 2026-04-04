// Last updated: 04/04/2026, 23:28:00
class Solution {
    private int getTLS(List<Integer> list) {
        List<Integer> tails = new ArrayList<>();
        for(int i=0;i<list.size();i++) {
            int x = list.get(i);
            int low = 0;
            int high = tails.size();
            while(low<high) {
                int mid = low+(high-low)/2;
                if(tails.get(mid)<x) low = mid+1;
                else high = mid;
            }
            if(low==tails.size()) tails.add(x);
            else tails.set(low, x);
        }
        return tails.size();
    }
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        for(int i=0;i<30;i++) {
            List<Integer> filter = new ArrayList<>();
            for(int j=0;j<nums.length;j++) {
                if(((nums[j]>>i)&1)==1) {
                    filter.add(nums[j]);
                }
            }
            if(!filter.isEmpty()) {
                ans = Math.max(ans, getTLS(filter));
            }
        }
        return ans;
    }
}