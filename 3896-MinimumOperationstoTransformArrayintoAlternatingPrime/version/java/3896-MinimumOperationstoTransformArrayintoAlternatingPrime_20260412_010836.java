// Last updated: 12/04/2026, 01:08:36
1class Solution {
2    private static final int MAX = 1000007;
3    private static boolean[] isPrime = new boolean[MAX];
4    static {
5        Arrays.fill(isPrime, true);
6        isPrime[0] = isPrime[1] = false;
7        for(int p = 2; p * p < MAX; p++) {
8            if(isPrime[p]) {
9                for(int i = p * p; i < MAX; i += p)
10                    isPrime[i] = false;
11            }
12        }
13    }
14    public int minOperations(int[] nums) {
15        int ans = 0;
16        for(int i = 0; i < nums.length; i++) {
17            if(i % 2 == 0) {
18                ans += stepsToNextPrime(nums[i]);
19            } else {
20                ans += stepsToNextComposite(nums[i]);
21            }
22        }
23        return ans;
24    }
25
26    private int stepsToNextPrime(int n) {
27        int temp = n;
28        while(temp < MAX && !isPrime[temp]) {
29            temp++;
30        }
31        return temp - n;
32    }
33
34    private int stepsToNextComposite(int n) {
35        int temp = n;
36        while(temp < MAX && isPrime[temp]) {
37            temp++;
38        }
39        return temp - n;
40    }
41}