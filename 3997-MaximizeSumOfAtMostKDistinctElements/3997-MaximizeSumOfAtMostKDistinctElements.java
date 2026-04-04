// Last updated: 04/04/2026, 23:28:21
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> unqNums=new HashSet<>();
        for(int num:nums) unqNums.add(num);
        List<Integer> sorted = new ArrayList<>(unqNums);
        Collections.sort(sorted,Collections.reverseOrder());
        int resLen=Math.min(k,sorted.size());
        int[] res = new int[resLen];
        for(int i=0;i<resLen;i++) {
            res[i]=sorted.get(i);
        }
        return res;
    }
}