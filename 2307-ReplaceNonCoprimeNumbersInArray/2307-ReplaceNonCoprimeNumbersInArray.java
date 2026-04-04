// Last updated: 04/04/2026, 23:30:21
class Solution {
    public int GCD(int x,int y) {
        if(y==0) return x;
        return GCD(y,x%y);
    }
    public int LCM(int x,int y) {
        return (x/GCD(x,y))*y;
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        for(int i=1;i<nums.length;i++) {
            int num=nums[i];
            while(!st.isEmpty() && GCD(st.peek(),num)>1) {
                num=LCM(st.pop(),num);
            } 
            st.push(num);
        }
        return new ArrayList<>(st);
    }
}