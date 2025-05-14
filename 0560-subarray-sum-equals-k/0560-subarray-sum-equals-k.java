class Solution {
    public int subarraySum(int[] nums, int k) {
            int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1); // base case: sum 0 occurs once

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) has occurred before, there exists a subarray that sums to k
            if (prefixSums.containsKey(currentSum - k)) {
                count += prefixSums.get(currentSum - k);
            }

            // Update the count of currentSum in the map
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}