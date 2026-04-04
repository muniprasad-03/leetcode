// Last updated: 04/04/2026, 23:26:16
class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long[] s = new long[n];
        s[0] = nums[0]; 
        for(int i = 1;i<n;i++){
            s[i] = s[i-1]+nums[i];
        } 
        List<Integer> f = new ArrayList<>();
        for(int i = 0;i<n;i++) if(nums[i]>1)f.add(i);
        for(int i = 0;i<n;i++){
            long l = (i==0)?0:s[i-1];
            int k = Collections.binarySearch(f,i+1);
            if(k<0) k = -k-1;
            long p = 1;
            int c = 0; 
            for(int j = k;j<f.size()&&c<62;j++,c++){
                long v = nums[f.get(j)];
                if(p>l/v){
                    p = l+1;
                    break;
                }
                p *= v;
                if(p>l) break;
            }
            if(l==p) return i;
        }
        return -1;
    }
}