// Last updated: 04/05/2026, 23:30:39
class Solution {
    public boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2;i*i<=n;i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int temp = n;
        while(temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        int a = Math.min(n, rev);
        int b = Math.max(n, rev);
        int sum = 0;
        for(int i=a;i<=b;i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}