class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            int rq = target - nums[i];
            if(map.containsKey(rq)){
                result.add(map.get(rq));
                result.add(i);
            }
            map.put(nums[i], i);
        }
        int[] arr = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}