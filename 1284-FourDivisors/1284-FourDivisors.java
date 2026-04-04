// Last updated: 04/04/2026, 23:32:00
class Solution {
    private int countFactors(int num) {
        int factors = 0;
        int sum = 0;
        int i=1;
        for(;i*i<num;i++) {
            if(num%i == 0) {
                factors += 2;
                sum += i;
                sum += (num/i);
            }
            if(factors > 4) break;
        }
        if(i*i == num) {
            factors++;
            sum += i;
        }
        return factors==4 ? sum : -1;
    }
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            int sum = countFactors(num);
            if(sum != -1) {
                ans += sum;
            }
        }
        return ans;
    }
}