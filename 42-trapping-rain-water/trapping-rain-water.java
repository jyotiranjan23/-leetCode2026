class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = 0;
        right[height.length-1] = 0;
        int maxWater = 0;
        for(int i=1; i< height.length; i++){
            left[i] = Math.max(left[i-1], height[i-1]);
            right[height.length-1-i] = Math.max(right[height.length-i], height[height.length-i]);
        }
        for(int i=0; i< height.length; i++){
            int min = Math.min(left[i], right[i]);
            if(min < height[i]){
                maxWater+=0;
            }
            else{
                maxWater += min-height[i];
            }
        }
        return maxWater;
    }
}