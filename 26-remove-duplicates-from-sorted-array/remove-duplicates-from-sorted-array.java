class Solution {
    public int removeDuplicates(int[] nums) {
       int index = 0;
        int i=1;
        while(i < nums.length){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
            i++;
        }
        return index+1;
    }
}