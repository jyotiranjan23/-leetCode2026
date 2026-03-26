class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int majorityElementFrequency = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == majorityElement){
                majorityElementFrequency ++;
            }
            else {
                majorityElementFrequency --;
            if(majorityElementFrequency < 0){
                majorityElement = nums[i];
                majorityElementFrequency = 1;
            }

            }
        }
        return majorityElement;

    }
}