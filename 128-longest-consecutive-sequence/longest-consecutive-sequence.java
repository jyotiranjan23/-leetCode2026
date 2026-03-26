class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;
        for(int n: nums){
            set.add(n);
        }
        for(int n: set){
            int count = 0;
            int num = n;
            while(set.contains(num) && !set.contains(n-1)){
                count ++;
                num++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
