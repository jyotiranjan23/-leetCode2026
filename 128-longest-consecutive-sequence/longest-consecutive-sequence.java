class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();

        // Add all elements to set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through nums
        for (int num : set) {

            // Start only if it's the beginning of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;
                int current = num;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
