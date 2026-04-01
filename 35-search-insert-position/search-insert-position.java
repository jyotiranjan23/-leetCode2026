class Solution {
    public int searchInsert(int[] nums, int target) {
         int lb = 0;
          int ub = nums.length-1;
          int result = nums.length;
          while(lb <= ub){
            int mid = (lb+ub)/2;
            if(nums[mid] == target){
                result= mid;
                break;
            }
            else if(target < nums[mid]){
                if(lb == ub){
                    if(target < nums[lb]){
                        result = 0;
                        break;
                    }
                    result =  lb+1;
                    break;
                } 
                ub = mid-1;
                if(ub < 0) {
                    result = 0;
                    break;
                }
                
            }
            else {
                if(lb == ub){
                    result =  ub+1;
                    break;
                } 
                lb = mid+1;
                if(nums[lb] > target){
                    result = lb;
                    break;
                }
            }
          }
          return result; 
    }
}