// Last updated: 04/04/2026, 23:31:06
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int s : students) q.offer(s);
        int i = 0;
        int n = sandwiches.length;
        int r = 0;
        while(!q.isEmpty() && r<n) {
            if(q.peek()==sandwiches[i]) {
                q.poll();
                i++;
                r=0;
            } else {
                q.offer(q.poll());
                r++;
            }
        }
        return q.size();
    }
}