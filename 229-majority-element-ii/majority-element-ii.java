class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int majorityValue = nums.length/3;
        Integer maj1 = -1;
        Integer maj2 = -1;
        int count1 = 0;
        int count2 = 0;
        for(int n: nums){
            if(n == maj1){
                count1++;
            }
            else if(n == maj2){
                count2++;
            }
            else if(count1 == 0){
                maj1 = n;
                count1 = 1;
            }
            else if(count2 == 0){
                maj2 = n;
                count2 = 1;

            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> result = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;
        for(int n: nums){
            if(n == maj1) freq1++;
            else if(n == maj2) freq2++;
        }
        if(freq1 > majorityValue) result.add(maj1);
        if(freq2 > majorityValue) result.add(maj2);

        return result;
        
    }
}