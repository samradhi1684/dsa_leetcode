import java.util.HashMap;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map stores (mod value) -> index
        HashMap<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1); // handle case where sum[0...i] % k == 0

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;

            // Normalize negative mod
            if (mod < 0) mod += k;

            if (modMap.containsKey(mod)) {
                if (i - modMap.get(mod) >= 2) {
                    return true;
                }
            } else {
                modMap.put(mod, i);
            }
        }

        return false;
    }
}
