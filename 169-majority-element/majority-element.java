class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int frequency = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == majorityElement){
                frequency++;
            }
            else{
                frequency--;
                if(frequency == 0){
                    majorityElement = nums[i];
                    frequency++;
                }
            }
        }
        return majorityElement;

    }
}