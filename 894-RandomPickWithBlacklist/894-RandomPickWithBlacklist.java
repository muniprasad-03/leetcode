// Last updated: 04/04/2026, 23:32:47
class Solution {
    private Map<Integer, Integer> map = new HashMap<>();
    private Random rand = new Random();
    private int size;
    public Solution(int n, int[] blacklist) {
        size = n - blacklist.length;
        HashSet<Integer> set = new HashSet<>();
        for(int b : blacklist) {
            set.add(b);
        }
        int last = n - 1;
        for(int b : blacklist) {
            if(b < size) {
                while(set.contains(last)) {
                    last--;
                }
                map.put(b, last);
                last--;
            }
        }
    }
    public int pick() {
        int x = rand.nextInt(size);
        if(map.containsKey(x)) {
            return map.get(x);
        }
        return x;
    }
}