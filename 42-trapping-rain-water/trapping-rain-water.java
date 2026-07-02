class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int l = 0;
        int r = n-1;
        int leftMax = height[0];
        int rightMax = height[n-1];
        while (l <= r) {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);
            if(leftMax < rightMax){
                maxWater += Math.max(0, leftMax-height[l]);
                l++;
            }
            else{
                maxWater += Math.max(0, rightMax-height[r]);
                r--;
            }
        }
        return maxWater;
    }
}