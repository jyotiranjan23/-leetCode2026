class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> hashSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
             Set<Integer> set = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                if(set.contains(0-(nums[i]+nums[j]))){
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[j]);
                    list1.add(0-(nums[i]+nums[j]));
                    Collections.sort(list1);
                    hashSet.add(list1);

                }
                set.add(nums[j]);
            }
        }
        result = hashSet.stream().map(l -> new ArrayList<>(l))
        .collect(Collectors.toList());
        return result;
    }
}