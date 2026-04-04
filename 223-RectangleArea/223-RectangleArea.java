// Last updated: 04/04/2026, 23:35:40
class Solution {
    int calArea(int x1, int y1, int x2, int y2) {
        int len = Math.abs(x2-x1);
        int brd = Math.abs(y2-y1);
        return len*brd;
    }
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = calArea(ax1, ay1, ax2, ay2);
        int area2 = calArea(bx1, by1, bx2, by2);
        int cx1 = Math.max(ax1, bx1);
        int cy1 = Math.max(ay1, by1);
        int cx2 = Math.min(ax2, bx2);
        int cy2 = Math.min(ay2, by2);
        int area3 = 0;
        if(cx1 < cx2 && cy1 < cy2) {
            area3 = Math.max(area3, calArea(cx1, cy1, cx2, cy2));
        }
        return area1 + area2 - area3;
    }
}