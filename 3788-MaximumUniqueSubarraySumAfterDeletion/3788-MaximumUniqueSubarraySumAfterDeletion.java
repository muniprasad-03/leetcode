// Last updated: 04/04/2026, 23:29:00
class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, Integer> maxOccurrence = new HashMap<>();

        // Store max value of each unique element
        for (int num : nums) {
            maxOccurrence.put(num, Math.max(maxOccurrence.getOrDefault(num, Integer.MIN_VALUE), num));
        }
        int totalSum = 0;
        boolean hasPositive = false;

        for (int val : maxOccurrence.values()) {
            if (val > 0) {
                totalSum += val;
                hasPositive = true;
            }
        }
        // If no positive number, pick the max element (could be negative)
        if (!hasPositive) {
            int maxNum = Integer.MIN_VALUE;
            for (int num : nums) {
                maxNum = Math.max(maxNum, num);
            }
            return maxNum;
        }

        return totalSum;
    }
}
