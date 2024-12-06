class Solution {

    public  void reverse(int[] nums,int start , int end) {
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int indexToSwap = -1;

        for(int i = n-1; i>0;i--){
            if(nums[i-1]<nums[i]){
                indexToSwap = i-1;
                break;
            }
        }

        if (indexToSwap == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        int swap_index = indexToSwap;

        for (int j = n-1; j > indexToSwap; j--) {
            if(nums[j]>nums[indexToSwap]){
                swap_index = j;
                break;
            }

        }

        int temp = nums[indexToSwap];
        nums[indexToSwap]= nums[swap_index];
        nums[swap_index] = temp;

        reverse(nums,indexToSwap+1,n-1);
       
    }
}