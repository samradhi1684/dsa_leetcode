import java.util.*;

class Solution {
    public int minOperations(int[] nums, int k) {
        // Step 1: If any number is less than k, it's impossible
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                return -1;
            }
        }

        // Step 2: Use a set to collect all unique values greater than k
        Set<Integer> greaterThanK = new HashSet<>();
        for (int num : nums) {
            if (num > k) {
                greaterThanK.add(num);
            }
        }

        // Step 3: If no values are greater than k, we're done
        if (greaterThanK.isEmpty()) {
            return 0;
        }

        // Step 4: Count how many unique "cuts" we need
        List<Integer> sorted = new ArrayList<>(greaterThanK);
        Collections.sort(sorted, Collections.reverseOrder()); // largest to smallest

        return sorted.size(); // Each unique value > k needs 1 operation
    }
}
