// Last updated: 04/04/2026, 23:36:01
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int temp = n;
        while(!set.contains(temp)) {
            set.add(temp);
            int sum = 0;
            while(temp > 0) {
                int d = temp%10;
                sum += (d*d);
                temp /= 10;
            }
            if(sum == 1) return true;
            temp = sum;
        }
        return false;
    }
}