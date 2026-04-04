// Last updated: 04/04/2026, 23:28:02
class Solution {
    public int distinctPoints(String s, int k) {
        int n = s.length();
        int[] prevXCache = new int[n+1];
        int[] prevYCache = new int[n+1];
        for(int i=0;i<n;i++) {
            char m=s.charAt(i);
            prevXCache[i+1]=prevXCache[i];
            prevYCache[i+1]=prevYCache[i];
            switch(m) {
                case 'U' :
                    prevYCache[i+1]++;
                    break;
                case 'D' :
                    prevYCache[i+1]--;
                    break;
                case 'L' :
                    prevXCache[i+1]--;
                    break;
                case 'R' :
                    prevXCache[i+1]++;
                    break;
            }
        }
        Set<String> unqDisp=new HashSet<>();
        for(int i=0;i<=n-k;i++) {
            int cX=prevXCache[i+k]-prevXCache[i];
            int cY=prevYCache[i+k]-prevYCache[i];
            unqDisp.add(cX+","+cY);
        }
        return unqDisp.size();
    }
}