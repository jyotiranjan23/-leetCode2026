class Solution {
    public void nextPermutation(int[] nums) {
        // first find the break point.
        int pivot = -1;
        int n=nums.length-1;
        for(int i=n; i>0; i--){
            if(nums[i] > nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        //if pivot == -1 then reverse the entire array
        if(pivot == -1){
            reverse(nums,0,n);
        }
        else{
        // find the next greater element from n to pivot+1 and swap with pivot.
        for(int i=n; i>pivot; i--){
            if(nums[i] > nums[pivot]){
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }
        //reverse the array from pivot+1 index to n.
        reverse(nums, pivot+1,n);
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