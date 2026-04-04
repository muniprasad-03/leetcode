// Last updated: 04/04/2026, 23:33:09
class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node child = curr.child;
                Node next = curr.next;
                Node tail = child;
                while (tail.next != null) {
                    tail = tail.next;
                }
                if (next != null) {
                    tail.next = next;
                    next.prev = tail;
                }
                curr.next = child;
                child.prev = curr;
                curr.child = null;
            }
            curr = curr.next;
        }
        return head;
    }
}
