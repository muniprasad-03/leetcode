// Last updated: 04/04/2026, 23:26:01
class EventManager {

    private PriorityQueue<int[]> pq;
    private Map<Integer, Integer> latestPrty;
    
    public EventManager(int[][] events) {
        pq = new PriorityQueue<>((a, b)-> {
            if(b[0] != a[0]) return Integer.compare(b[0], a[0]);
            return Integer.compare(a[1], b[1]);
        });
        latestPrty = new HashMap<>();
        for(int[] event : events) {
            int id = event[0];
            int prty = event[1];
            latestPrty.put(id, prty);
            pq.offer(new int[]{prty, id});
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        latestPrty.put(eventId, newPriority);
        pq.offer(new int[]{newPriority, eventId});
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()) {
            int[] top = pq.poll();
            int p = top[0];
            int id = top[1];
            if(latestPrty.containsKey(id) && latestPrty.get(id) == p) {
                latestPrty.remove(id);
                return id;
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */