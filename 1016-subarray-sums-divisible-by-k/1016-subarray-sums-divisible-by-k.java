import java.util.HashMap;

public class Solution {

    public static int subarraysDivByK(int[] nums, int k) {
        // Map to count frequency of prefix sum mod values
        HashMap<Integer, Integer> modCount = new HashMap<>();
        modCount.put(0, 1); // Base case: empty subarray sum divisible by k

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            int mod = prefixSum % k;

            // Handle negative mod
            if (mod < 0) {
                mod += k;
            }

            // If this mod has been seen before, add its count
            if (modCount.containsKey(mod)) {
                count += modCount.get(mod);
            }

            // Update mod frequency
            modCount.put(mod, modCount.getOrDefault(mod, 0) + 1);
        }

        return count;
    }
}