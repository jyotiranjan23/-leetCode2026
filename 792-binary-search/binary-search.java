class Solution {
    public int search(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length-1;
        int result = -1;
        while(lb <= ub){
            int mid = (lb+ub)/2;
            if(nums[mid] == target){
                result = mid;
                break;
            }
            else if(target > nums[mid]){
                lb = mid+1;
            }
            else {
                ub = mid-1;
            }
        }
        return result;
    }
}