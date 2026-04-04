// Last updated: 04/04/2026, 23:27:18
class Solution{
    public int minimumDistance(int[] nums){
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.putIfAbsent(nums[i],new ArrayList<>());
            m.get(nums[i]).add(i);
        }
        for(List<Integer> l:m.values()){
            if(l.size()<3) continue;
            for(int x=0;x<=l.size()-3;x++){
                int a=l.get(x);
                int c=l.get(x+2);
                min=Math.min(min,c-a);
            }
        }
        return (min==Integer.MAX_VALUE)?-1:2*min;
    }
}
