// Last updated: 04/04/2026, 23:32:57
class MyHashMap {

    private static class Node {
        int key, value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 1000;
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = buckets[index];
        for (Node curr = head; curr != null; curr = curr.next) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
        }
        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    public int get(int key) {
        int index = hash(key);
        Node curr = buckets[index];
        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node curr = buckets[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) buckets[index] = curr.next;
                else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
