// Last updated: 04/04/2026, 23:34:47
class Solution {
public:
    int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int ans = 10;
        int unqNums = 9;
        int avbDigits = 9;
        for(int i=1;i<n;i++){
            unqNums *= avbDigits;
            ans += unqNums;
            avbDigits--;
        }
        return ans;
    }
};