// Last updated: 04/04/2026, 23:28:39
class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private int[] result;
    public int[] minDifference(int n, int k) {
        result = new int[k];
        findSplits(n, k, 1, new ArrayList<>());
        return result;
    }
    private void findSplits(int target, int count, int start, List<Integer> factors) {
        if (count == 1) {
            if (target >= start) {
                factors.add(target);
                int diff = factors.get(factors.size() - 1) - factors.get(0);
                if (diff < minDiff) {
                    minDiff = diff;
                    for (int i = 0; i < factors.size(); i++) {
                        result[i] = factors.get(i);
                    }
                }
                factors.remove(factors.size() - 1);
            }
            return;
        }
        for (int i = start; i * i <= target; i++) {
            if (target % i == 0) {
                factors.add(i);
                findSplits(target / i, count - 1, i, factors);
                factors.remove(factors.size() - 1);
            }
        }
    }
}