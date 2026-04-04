// Last updated: 04/04/2026, 23:29:09
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k){
        int n=nums.size();
        if(n<2*k) return false;
        for(int i=0;i<=n-2*k;i++){
            boolean first=true;
            for(int j=i+1;j<i+k;j++){
                if(nums.get(j-1)>=nums.get(j)){
                    first=false;
                    break;
                }
            }
            if(first){
                boolean second=true;
                for(int j=i+k+1;j<i+2*k;j++){
                    if(nums.get(j-1)>=nums.get(j)){
                        second=false;
                        break;
                    }
                }
                if(second){
                    return true;
                }
            }
        }
        return false;
    }
}