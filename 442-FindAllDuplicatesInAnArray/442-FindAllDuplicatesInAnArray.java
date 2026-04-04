// Last updated: 04/04/2026, 23:34:20
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] map = new int[n+1];
        List<Integer> ans = new ArrayList<>();
        for(int num:nums) {
            map[num]++;
        }
        for(int i=1;i<=n;i++) {
            if(map[i]==2) ans.add(i);
        }
        return ans;
    }
}