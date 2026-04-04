// Last updated: 04/04/2026, 23:33:08
class Solution {
    private boolean[] sieve() {
        boolean[] isPrime = new boolean[33];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i*i<=32;i++) {
            if(isPrime[i]) {
                for(int j=2*i;j<=32;j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        boolean[] isPrime = sieve();
        for(int i=left;i<=right;i++) {
            int setBits = Integer.bitCount(i);
            if(isPrime[setBits]) ans++;
        }
        return ans;
    }
}