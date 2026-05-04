// Last updated: 04/05/2026, 23:30:56
class Solution {
    private static final int MAX = 1000007;
    private static boolean[] isPrime = new boolean[MAX];
    static {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int p = 2; p * p < MAX; p++) {
            if(isPrime[p]) {
                for(int i = p * p; i < MAX; i += p)
                    isPrime[i] = false;
            }
        }
    }
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                ans += stepsToNextPrime(nums[i]);
            } else {
                ans += stepsToNextComposite(nums[i]);
            }
        }
        return ans;
    }

    private int stepsToNextPrime(int n) {
        int temp = n;
        while(temp < MAX && !isPrime[temp]) {
            temp++;
        }
        return temp - n;
    }

    private int stepsToNextComposite(int n) {
        int temp = n;
        while(temp < MAX && isPrime[temp]) {
            temp++;
        }
        return temp - n;
    }
}