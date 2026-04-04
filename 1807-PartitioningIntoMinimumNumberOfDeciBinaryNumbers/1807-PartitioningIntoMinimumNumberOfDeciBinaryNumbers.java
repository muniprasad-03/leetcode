// Last updated: 04/04/2026, 23:31:05
class Solution {
    public int minPartitions(String n) {
        int count = 0;
        char[] arr = n.toCharArray();
        int l = arr.length;
        while(true) {
            boolean changed = false;
            for(int j=0;j<l;j++) {  
                if(arr[j] > '0') {
                    arr[j]--;
                    changed = true;
                }
            }
            if(changed) count++;
            else return count;
        }
    }
}