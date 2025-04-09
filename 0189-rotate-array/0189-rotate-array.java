class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k > n

        // Step 1: Reverse the whole array (7,6,5,4,3,2,1)
        reverse(nums, 0, n - 1);
        // Step 2: Reverse first k elements (5,6,7|4,3,2,1)
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the last elementa after k (5,6,7|1,2,3,4)
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
