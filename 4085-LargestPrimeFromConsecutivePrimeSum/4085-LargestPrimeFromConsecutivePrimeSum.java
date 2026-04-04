// Last updated: 04/04/2026, 23:27:32
class Solution {
    private boolean[] sieve(int n) {
        if(n<2) return new boolean[0];
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i<=n; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<=n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    public int largestPrime(int n) {
        if(n<2) return 0;
        boolean[] isPrime = sieve(n);
        List<Integer> primes = new ArrayList<>();
        for(int i=2;i<=n;i++) {
            if(isPrime[i]) primes.add(i);
        }
        int largestPrimeSum = 0;
        long currSum = 0;
        for(int p : primes) {
            currSum += p;
            if(currSum > n) break;
            if(isPrime[(int)currSum]) {
                largestPrimeSum = (int) currSum;
            }
        }
        return largestPrimeSum;
    }
}