class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            if(prefixSum == k){
                count++;
            }
            int requiredNum = prefixSum - k;
            if(map.containsKey(requiredNum)){
                count+= map.get(requiredNum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}