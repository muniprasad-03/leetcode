// Last updated: 04/04/2026, 23:28:45
class Solution {
    public boolean[] isPrime(int n) {
        boolean[] primeIdx = new boolean[n+1];
        for(int i=0;i<=n;i++) {
            primeIdx[i] = i>1;
        }
        for(int i=2;i*i<=n;i++) {
            if(primeIdx[i]) {
                for(int j=i*i;j<=n;j+=i) {
                    primeIdx[j]=false;
                }
            }
        }
        return primeIdx;
    }
    public long splitArray(int[] nums) {
        int n = nums.length;
        long sumA=0,sumB=0;
        boolean[] prime = isPrime(n-1);
        for(int i=0;i<n;i++) {
            if(prime[i]) {
                sumA+=nums[i];
            } else {
                sumB+=nums[i];
            }
        }
        return Math.abs(sumA-sumB);
    }
}