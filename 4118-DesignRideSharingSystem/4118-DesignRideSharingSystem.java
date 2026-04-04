// Last updated: 04/04/2026, 23:27:20
class RideSharingSystem {
    Queue<Integer> driverQ = new LinkedList<>();
    Queue<Integer> riderQ = new LinkedList<>();
    Set<Integer> cancelSet = new HashSet<>();
    Set<Integer> activeSet = new HashSet<>();
    
    public RideSharingSystem() {
        
    }
    
    public void addRider(int riderId) {
        riderQ.offer(riderId);
        activeSet.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driverQ.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!riderQ.isEmpty() && cancelSet.contains(riderQ.peek())) {
            int r = riderQ.poll();
            cancelSet.remove(r);
        }
        if(driverQ.isEmpty() || riderQ.isEmpty()) {
            return new int[]{-1, -1};
        }
        int r = riderQ.poll();
        activeSet.remove(r);
        return new int[]{driverQ.poll(), r};
    }
    
    public void cancelRider(int riderId) {
        if(activeSet.contains(riderId)) {
            cancelSet.add(riderId);
            activeSet.remove(riderId);
        }
    }
}