// Last updated: 04/04/2026, 23:32:22
class TimeMap {
    class Pair {
        String val;
        int time;
        Pair(String val, int time) {
            this.val = val;
            this.time = time;
        }
    }
    private Map<String, List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> row = map.get(key);
        int start = 0;
        int end = row.size()-1;
        String ans = "";
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(row.get(mid).time <= timestamp) {
                ans = row.get(mid).val;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */