class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int requiredFrequency = nums.length/3;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > requiredFrequency){
                result.add(entry.getKey());
            }
        }
        return result;
        
    }
}