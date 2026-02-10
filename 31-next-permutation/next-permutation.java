class Solution {
    public void nextPermutation(int[] nums) {
        // first find the break point.
        int pivot = -1;
        int lastIndex=nums.length-1;
        for(int i=lastIndex; i>0; i--){
            if(nums[i] > nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        //if pivot == -1 then reverse the entire array
        if(pivot == -1){
            reverse(nums,0,lastIndex);
        }
        else{
        // find the next greater element from n to pivot+1 and swap with pivot.
        for(int i=lastIndex; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        //reverse the array from pivot+1 index to n.
        reverse(nums, pivot+1,lastIndex);
        }
    }
    public void reverse(int[] arr, int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}