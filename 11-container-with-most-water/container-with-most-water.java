class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxWater = Integer.MIN_VALUE;
        while (i < j) {
            int widthOfWater = j-i;
            int heightOfWater = Math.min(height[j], height[i]);
            maxWater = Math.max(maxWater, widthOfWater*heightOfWater);
            if(height[i] <= height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}