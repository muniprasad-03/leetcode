// Last updated: 04/04/2026, 23:28:14
class Solution {
    public boolean find(int[] friends,int num) {
        int start = 0;
        int end = friends.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(friends[mid]==num) return true;
            else if(friends[mid] < num) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> ans = new ArrayList<>();
        for(int num : order) {
            if(find(friends,num)) {
                ans.add(num);
            }
        }
        int[] ansArr = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}