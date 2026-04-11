// Last updated: 12/04/2026, 00:09:34
1class Solution {
2    // public void seive(boolean[] isPrime) {
3    //     isPrime[0] = false;
4    //     isPrime[1] = false;
5    //     int lim = 100006;
6    //     for(int i=2 ; i*i <= lim; i++) {
7    //         if(nums[i] == true) {
8    //             for(int j = 2*i; j < lim; j = j*i) {
9    //                 nums[i] = false;
10    //             }
11    //         }
12    //     }
13    // }
14    public int minOperations(int[] nums) {
15        // boolean[] isPrime = new boolean[100006];
16        // Arrays.fill(isPrime, true);
17        // seive(isPrime);
18        // boolean[] vis = new boolean[100006];
19        // for(int ) 
20        int ans = 0;
21        for(int i=0; i<nums.length; i+=2) {
22            if(isPrime(nums[i])) continue;
23            int temp = nums[i] + 1;
24            while(isPrime(temp) == false) {
25                temp++;
26            }
27            ans += (temp - nums[i]);
28        }
29        for(int i=1; i<nums.length; i+=2) {
30            if(!isPrime(nums[i])) continue;
31            int temp = nums[i] + 1;
32            while(isPrime(temp) == true) {
33                temp++;
34            }
35            ans += (temp - nums[i]);
36        }
37        return ans;
38    }
39    public boolean isPrime(int n) {
40        if(n <= 1) return false;
41        for(int i=2; i*i <= n; i++) {
42            if(n % i == 0) return false;
43        }
44        return true;
45    }
46}