// Last updated: 04/04/2026, 23:29:40
class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {
        int maxDiagSq = 0;
        int maxArea = 0;
        for (vector<int>& rect : dimensions) {
            int len = rect[0], wid = rect[1];
            int diagSq = len * len + wid * wid;
            int area = len * wid;
            if (diagSq > maxDiagSq) {
                maxDiagSq = diagSq;
                maxArea = area;
            } else if (diagSq == maxDiagSq) {
                maxArea = max(maxArea, area);
            }
        }
        return maxArea;
    }
};
