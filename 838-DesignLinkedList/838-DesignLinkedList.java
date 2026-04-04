// Last updated: 04/04/2026, 23:32:54
import java.util.LinkedList;
class MyLinkedList {
    LinkedList<Integer> list;

    public MyLinkedList() {
        list = new LinkedList<>();
    }

    public int get(int index) {
        if (index < 0 || index >= list.size()) return -1;
        return list.get(index);
    }

    public void addAtHead(int val) {
        list.addFirst(val);
    }

    public void addAtTail(int val) {
        list.addLast(val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > list.size()) return;
        list.add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= list.size()) return;
        list.remove(index);
    }
}
