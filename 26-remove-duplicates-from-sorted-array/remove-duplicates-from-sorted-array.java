class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        while(j < nums.length){
            if(nums[j] == nums[i]){
                j++;
            }
            else {
                if(j != 0 && nums[j] != nums[j-1]){
                    i++;
                    nums[i] = nums[j];
                    j++;
                }
            }

        }
        return i+1;
    }
}