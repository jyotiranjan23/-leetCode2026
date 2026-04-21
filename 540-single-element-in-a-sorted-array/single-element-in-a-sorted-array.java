class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i <= j){
            int mid = (i+j)/2;
            if(mid == 0 || mid == nums.length-1) return nums[mid];
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if(mid %2 == 0){
                if(nums[mid] == nums[mid-1]){
                j=mid-1;
                }
                else {
                i=mid+1;
                }
            }
            else {
                if(nums[mid] == nums[mid-1]){
                i=mid+1;
                }
                else {
                j=mid-1;
                }
            }
            
        }
        return -1;
    }
}