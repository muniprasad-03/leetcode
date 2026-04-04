// Last updated: 04/04/2026, 23:28:46
class Solution {
    public int minSplitMerge(int[] nums1, int[] nums2) {
        int n=nums1.length;
        List<Integer> stList = new ArrayList<>();
        for(int num : nums1) {
            stList.add(num);
        }
        List<Integer> tarList = new ArrayList<>();
        for(int num : nums2) {
            tarList.add(num);
        }
        if(stList.equals(tarList)) {
            return 0;
        }
        Queue<List<Integer>> q = new LinkedList<>();
        Map<List<Integer>, Integer> disMap = new HashMap<>();
        q.offer(stList);
        disMap.put(stList, 0);
        while(!q.isEmpty()) {
            List<Integer> curr = q.poll();
            int currDis = disMap.get(curr);
            for(int i=0;i<n;i++) {
                for(int j=i;j<n;j++) {
                    List<Integer> subArr = new ArrayList<>(curr.subList(i,j+1));
                    List<Integer> rem = new ArrayList<>(curr);
                    rem.subList(i, j+1).clear();
                    for(int k=0;k<rem.size();k++) {
                        List<Integer> nxtList = new ArrayList<>(rem);
                        nxtList.addAll(k, subArr);
                        if(!disMap.containsKey(nxtList)) {
                            if(nxtList.equals(tarList)) {
                                return currDis + 1;
                            }
                            disMap.put(nxtList, currDis + 1);
                            q.offer(nxtList);
                        }
                   }
                }
            }
        }
        return -1;
    }
}