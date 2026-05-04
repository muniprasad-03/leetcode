// Last updated: 04/05/2026, 23:31:01
class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int lim = (int) Math.cbrt(n);
        for (int a = 1;a <= lim;a++) {
            long a3 = (long) a*a*a;
            for (int b = a;b <= lim;b++) {
                long b3 = (long) b*b*b;
                long sum = a3 + b3;
                if (sum <= n) {
                    int s = (int) sum;
                    map.put(s, map.getOrDefault(s, 0) + 1);
                } else {
                    break;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
    }
}