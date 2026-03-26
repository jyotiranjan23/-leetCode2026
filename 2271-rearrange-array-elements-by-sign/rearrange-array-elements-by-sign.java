class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pi = 0;
        int ni = 1;
        for(int i=0; i<result.length; i++){
            if(nums[i] > 0){
                result[pi] = nums[i];
                pi+=2;
            }
            else {
                result[ni] = nums[i];
                ni+=2;
            }
        }
        return result;
    }
}