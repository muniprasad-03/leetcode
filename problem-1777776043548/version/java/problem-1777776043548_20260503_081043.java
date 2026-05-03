// Last updated: 03/05/2026, 08:10:43
1class Solution {
2    public boolean isPrime(int n) {
3        if(n <= 1) return false;
4        for(int i=2;i*i<=n;i++) {
5            if(n % i == 0) return false;
6        }
7        return true;
8    }
9    public int sumOfPrimesInRange(int n) {
10        int rev = 0;
11        int temp = n;
12        while(temp != 0) {
13            int rem = temp % 10;
14            rev = rev * 10 + rem;
15            temp = temp / 10;
16        }
17        int a = Math.min(n, rev);
18        int b = Math.max(n, rev);
19        int sum = 0;
20        for(int i=a;i<=b;i++) {
21            if(isPrime(i)) {
22                sum += i;
23            }
24        }
25        return sum;
26    }
27}