// Last updated: 04/05/2026, 23:30:00
class Solution {
    public void wiggleSort(int[] nums) {
        int half = nums.length/2;       //3

        Arrays.sort(nums);

        int[] secondHalf = new int[half];

        if(nums.length%2 != 0)   //Array odd
            half = nums.length/2+1;
        else                    // Array. even
            half = nums.length/2;
            

        int[] firstHalf = new int[half];
        
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(i < half){   //0 1 2
                firstHalf[i] = nums[i];
            }else{  //3 4 5
                System.out.println(secondHalf[index]);
                secondHalf[index] = nums[i];
                index++;
            }
        }

        reverse(firstHalf,0,firstHalf.length-1);
        reverse(secondHalf,0,secondHalf.length-1);

        int ind1=0, ind2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2==0){
                nums[i] = firstHalf[ind1++];
            }else{
                nums[i] = secondHalf[ind2++];
            }
        }
    }

    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}