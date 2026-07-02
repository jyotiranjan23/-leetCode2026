class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int l = 0;
        int r = n-1;
        while (l <= r) {
            maxLeft = Math.max(maxLeft, height[l]);
            maxRight = Math.max(maxRight, height[r]);

            if(maxLeft < maxRight){
                maxWater += Math.max(0, maxLeft-height[l]);
                l++;
            }
            else {
                maxWater += Math.max(0, maxRight - height[r]);
                r--;
            }
        }
        return maxWater;
    }
}