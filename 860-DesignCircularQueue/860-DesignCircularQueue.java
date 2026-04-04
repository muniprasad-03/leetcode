// Last updated: 04/04/2026, 23:32:52
class MyCircularQueue {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    private int size,capacity;
    private Node head,tail;
    public MyCircularQueue(int k) {
        head = null;
        tail = null;
        size = 0;
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if(this.isFull()) return false;
        size++;
        if(tail == null) {
            tail = new Node(value);
            head = tail;
            return true;
        }
        tail.next = new Node(value);
        tail = tail.next;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        size--;
        if(head == tail) {
            head = tail = null;
            return true;
        }
        head = head.next;
        return true;
    }
    
    public int Front() {
        return this.isEmpty() ? -1 : head.val;
    }
    
    public int Rear() {
        return this.isEmpty() ? -1 : tail.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */