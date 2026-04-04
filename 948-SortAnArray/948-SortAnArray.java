// Last updated: 04/04/2026, 23:32:33
class Solution {
    public void mergeSortedArrays(int[] nums, int leftStart, int leftEnd, int rightStart, int rightEnd) {
        int[] leftArray = Arrays.copyOfRange(nums, leftStart, leftEnd + 1);
        int[] rightArray = Arrays.copyOfRange(nums, rightStart, rightEnd + 1);

        int i = 0, j = 0, k = leftStart;
        while (i < leftArray.length && j < rightArray.length) {
            nums[k++] = (leftArray[i] <= rightArray[j]) ? leftArray[i++] : rightArray[j++];
        }
        while (i < leftArray.length) nums[k++] = leftArray[i++];
        while (j < rightArray.length) nums[k++] = rightArray[j++];
    }

    public void mergeSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        mergeSortedArrays(nums, start, mid, mid + 1, end);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
