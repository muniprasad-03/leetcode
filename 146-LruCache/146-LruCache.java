// Last updated: 04/04/2026, 23:36:33
class LRUCache {
    class Node {
        int key,val;
        Node prev,next;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = this.next = null;
        }
    }
    Map<Integer, Node> map;
    Node dummyHead, dummyTail;
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        dummyHead = new Node(-1,-1);
        dummyTail = new Node(-1,-1);
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }
        Node curr = map.get(key);
        moveToFront(curr);
        return curr.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node curr = map.get(key);
            moveToFront(curr);
            curr.val = value;
        } else {
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addNode(newNode);
            if(map.size() >capacity) {
                removeLRU();
            }
        }
    }
    private void moveToFront(Node curr) {
        deleteNode(curr);
        addNode(curr);
    }
    private void addNode(Node newNode) {
        newNode.prev = dummyHead;
        newNode.next = dummyHead.next;
        dummyHead.next.prev = newNode;
        dummyHead.next = newNode;
    }
    private void deleteNode(Node curr) {
        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;
    }
    private void removeLRU() {
        Node last = dummyTail.prev;
        last.prev.next = dummyTail;
        dummyTail.prev = last.prev;
        last.prev = last.next = null;
        map.remove(last.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */