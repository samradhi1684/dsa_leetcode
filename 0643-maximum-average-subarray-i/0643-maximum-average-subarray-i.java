public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first k elements
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        // Initialize maxSum as the currentSum
        double maxSum = currentSum;

        // Use sliding window to calculate sum of next windows of size k
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return average
        return maxSum / k;
    }
}
