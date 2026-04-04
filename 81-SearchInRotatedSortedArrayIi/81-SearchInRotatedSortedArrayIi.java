// Last updated: 04/04/2026, 23:37:39
class Solution {
    public boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = (start + end) / 2 ;
            if(arr[mid]==target) {
                return true;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]) {
                start++;
                end--;
            } else if(arr[start] <= arr[mid]) {
                if(arr[start] <= target && target < arr[mid]) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            } else {
                if(arr[mid]<target && target<=arr[end]) {
                    start = mid+1;
                } else {
                    end =mid-1;
                }
            }
        }
        return false;
    }
}