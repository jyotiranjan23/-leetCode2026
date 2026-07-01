class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = 0;
        rightMax[n-1] = 0;
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i-1], leftMax[i-1]);
        }
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i+1]);
        }
        for(int i=0; i<n; i++){
            int min = Math.min(leftMax[i], rightMax[i]);
            if(min < height[i]){
                maxWater+=0;
            }
            else {
                maxWater += min - height[i];
            }
        }

        
        return maxWater;
    }
}