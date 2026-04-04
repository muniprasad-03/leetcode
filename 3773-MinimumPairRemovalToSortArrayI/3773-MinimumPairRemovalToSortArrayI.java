// Last updated: 04/04/2026, 23:29:01
class Solution {
    private boolean isSorted(List<Integer> list) {
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i) > list.get(i+1)) {
                return false;
            }
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);
        int ans = 0;
        while(!isSorted(list)) {
            ans++;
            int minIdx = -1;
            int minSum = Integer.MAX_VALUE;
            for(int i=0;i<list.size()-1;i++) {
                int sum = list.get(i) + list.get(i+1);
                if(sum < minSum) {
                    minSum = sum;
                    minIdx = i;
                }
            }
            list.set(minIdx, minSum);
            if(minIdx+1 < list.size());
            list.remove(minIdx+1);
        }
        return ans;
    }
}