// Last updated: 04/04/2026, 23:32:58
class MyHashSet {
    public static int size = 1000;
    LinkedList<Integer>[] buckets;
    public MyHashSet() {
        buckets = new LinkedList[size];
        for(int i=0;i<size;i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public int hashIdx(int key) {
        return key % size;
    }
    
    public void add(int key) {
        int idx = hashIdx(key);
        if(!buckets[idx].contains((Integer)key)) {
            buckets[idx].add(key);
        }
    }
    
    public void remove(int key) {
        buckets[hashIdx(key)].remove((Integer)key);
    }
    
    public boolean contains(int key) {
        return buckets[hashIdx(key)].contains((Integer)key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */