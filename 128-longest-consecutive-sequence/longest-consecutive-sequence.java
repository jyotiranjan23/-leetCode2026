class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;
        // add all elements to set
        for(int n:nums){
            set.add(n);
        }
        for(int n: set){
            if(!set.contains(n-1)){
                int count = 1;
                while(set.contains(n+1)){
                    count++;
                    n+=1;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
