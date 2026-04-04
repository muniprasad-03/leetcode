// Last updated: 04/04/2026, 23:35:15
class Solution {
public:
    int addDigits(int num) {
        if(num==0) return 0;
        else if(num%9==0) return 9;
        else return num%9; 
    }
};