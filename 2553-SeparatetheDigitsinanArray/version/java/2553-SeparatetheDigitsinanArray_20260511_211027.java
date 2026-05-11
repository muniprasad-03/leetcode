// Last updated: 11/05/2026, 21:10:27
class Solution {
    public int[] separateDigits(int[] nums) {
     List<Integer> a = new ArrayList<>();

    for (final int num : nums)
      for (final char c : String.valueOf(num).toCharArray())
        a.add(c - '0');
    return a.stream().mapToInt(Integer::intValue).toArray();    
    }
}