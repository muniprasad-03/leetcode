// Last updated: 04/04/2026, 23:28:37
class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        Map<Integer,Queue<Integer>> kept = new HashMap<>();
        int remCnt = 0;
        Queue<Integer> wind = new ArrayDeque<>();
        for(int i=0;i<arrivals.length;i++) {
            int d = i+1;
            int item = arrivals[i];
            int windSt = d-w+1;
            Queue<Integer> itemArrDay = kept.computeIfAbsent(item,k->new LinkedList<>());
            while (!itemArrDay.isEmpty()&&itemArrDay.peek()<windSt) {
                itemArrDay.poll();
            }
            if(itemArrDay.size()<m) {
                itemArrDay.add(d);
            } else {
                remCnt++;
            }
        }
        return remCnt++;
    }
}