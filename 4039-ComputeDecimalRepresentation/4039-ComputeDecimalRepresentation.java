// Last updated: 04/04/2026, 23:27:57
class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> ans = new ArrayList<>();
        int base = 1;
        while (n!=0) {
            int digit = n % 10;
            int val = digit * base;
            if(val != 0) {
                ans.add(val);
            }
            n /= 10;
            base *= 10;
        }
        int len = ans.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = ans.get(len - 1 - i);
        }
        return res;
    }
}