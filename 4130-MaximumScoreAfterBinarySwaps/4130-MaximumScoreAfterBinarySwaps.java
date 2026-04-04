// Last updated: 04/04/2026, 23:27:13
class Solution{
    public long maximumScore(int[] nums,String s) {
        long ans=0;
        int n=nums.length;
        PriorityQueue<Integer> avbVals=new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i<n) {
            while(i<n&&s.charAt(i)=='1') {
                ans+=nums[i];
                i++;
            }
            while(i<n&&s.charAt(i)=='0') {
                avbVals.add(nums[i]);
                i++;
            }
            while(i<n&&s.charAt(i)=='1') {
                avbVals.add(nums[i]);
                ans+=avbVals.poll();
                i++;
            }
        }
        return ans;
    }
}
