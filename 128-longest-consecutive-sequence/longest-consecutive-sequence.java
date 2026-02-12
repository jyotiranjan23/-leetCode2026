class Solution {
    public int longestConsecutive(int[] nums) {
        //create a set
        Set<Integer> set = new HashSet<>();
        int maxCount = 0;
        //copy all the elements from the array into the set.
        for(int n: nums){
            set.add(n);
        }
        //traverse the set and try to create consecutive elements 
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
