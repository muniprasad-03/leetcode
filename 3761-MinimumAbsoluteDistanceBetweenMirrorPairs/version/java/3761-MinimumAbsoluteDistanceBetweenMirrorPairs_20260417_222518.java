// Last updated: 17/04/2026, 22:25:18
class Solution 
{
    int reverse(int n)
    {
        int res = 0;
        while(n != 0)
        {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res;
    }
    public int minMirrorPairDistance(int[] arr) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(map.containsKey(arr[i]))
                min = Math.min(min, i - map.get(arr[i]));

            map.put(reverse(arr[i]), i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}