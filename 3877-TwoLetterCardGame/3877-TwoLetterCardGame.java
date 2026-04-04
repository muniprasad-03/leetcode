// Last updated: 04/04/2026, 23:28:49
class Solution {
    public int score(String[] cards, char x) {
        Map<Character,Integer> g1c=new HashMap<>();
        Map<Character,Integer> g2c=new HashMap<>();
        int xx=0;
        String xxStr=""+x+x;
        for(String card:cards) {
            if(card.indexOf(x)==-1) {
                continue;
            }
            if(card.equals(xxStr)) {
                xx++;
            } else if(card.charAt(0)==x) {
                g2c.put(card.charAt(1),g2c.getOrDefault(card.charAt(1),0)+1);
            } else {
                g1c.put(card.charAt(0),g1c.getOrDefault(card.charAt(0),0)+1);
            }
        }
        int total1=0;
        int max1=0;
        for(int count:g1c.values()){
            total1+=count;
            max1=Math.max(max1,count);
        }
        int total2=0;
        int max2=0;
        for(int count:g2c.values()){
            total2+=count;
            max2=Math.max(max2,count);
        }
        int maxPts=0;
        for(int k=0;k<=xx;k++) {
            int p1=calculatePairs(total1,max1,k);
            int p2=calculatePairs(total2,max2,xx-k);
            maxPts=Math.max(maxPts,p1+p2);
        }
        return maxPts;
    }

    private int calculatePairs(int total, int maxFreq, int wildcards) {
        int newTotal=total+wildcards;
        int newMax=Math.max(maxFreq,wildcards);
        int unmatchable=Math.max(0,2*newMax-newTotal);
        int pairs=(newTotal-unmatchable)/2;
        return pairs;
    }
}