// Last updated: 04/04/2026, 23:29:28
class Solution {
    private int encryptNum(int num) {
        int len = 0;
        int max = 0;
        while(num != 0) {
            max = Math.max(max, num%10);
            num /= 10;
            len++;
        }
        int changedNum = 0;
        for(int i=0;i<len;i++) {
            changedNum = changedNum*10 + max;
        }
        return changedNum;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            int changedNum = encryptNum(num);
            ans += changedNum;
        }
        return ans;
    }
}