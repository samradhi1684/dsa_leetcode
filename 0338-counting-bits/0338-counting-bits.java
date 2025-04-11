class Solution {
    public int[] countBits(int n) {
        // Create an array of size n + 1 to store results
        int[] ans = new int[n + 1];

        // Base case: 0 has 0 set bits
        ans[0] = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // ans[i >> 1] is count of set bits in i/2
            // (i % 2) adds 1 if i is odd
            ans[i] = ans[i >> 1] + (i % 2);
        }

        return ans;
    }
}
