// Last updated: 04/04/2026, 23:26:54
class Solution {
    public int maximumSum(int[] nums) {
        List<Integer> rem0List = new ArrayList<>(); 
        List<Integer> rem1List = new ArrayList<>(); 
        List<Integer> rem2List = new ArrayList<>();
        for(int num : nums) {
            if(num%3 == 0) rem0List.add(num);
            else if(num%3 == 1) rem1List.add(num);
            else rem2List.add(num);
        }
        Collections.sort(rem0List, Collections.reverseOrder());
        Collections.sort(rem1List, Collections.reverseOrder());
        Collections.sort(rem2List, Collections.reverseOrder());
        long res = 0;
        if(rem0List.size()>=3) {
            res = Math.max(res, (long)rem0List.get(0)+rem0List.get(1)+rem0List.get(2));
        }
        if(rem1List.size()>=3) {
            res = Math.max(res, (long)rem1List.get(0)+rem1List.get(1)+rem1List.get(2));
        }
        if(rem2List.size()>=3) {
            res = Math.max(res, (long)rem2List.get(0)+rem2List.get(1)+rem2List.get(2));
        }
        if(!rem0List.isEmpty() && !rem1List.isEmpty() && !rem2List.isEmpty()) {
            res = Math.max(res, (long)rem0List.get(0)+rem1List.get(0)+rem2List.get(0));
        }
        return (int) res;
    }
}