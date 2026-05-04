// Last updated: 05/05/2026, 00:01:39
1class Solution {
2    public String largestNumber(int[] nums) {
3        List<String> numbers = new ArrayList<>();
4        for(int i=0;i<nums.length;i++) numbers.add(String.valueOf(nums[i]));
5        Collections.sort(numbers,(a, b) -> {
6            return (b+a).compareTo(a+b);
7        });
8        if(numbers.get(0).equals("0")) return "0";
9        return String.join("",numbers);
10    }
11} 
12