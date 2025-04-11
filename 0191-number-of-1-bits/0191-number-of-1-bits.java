class Solution {
    public int hammingWeight(int n) {
             int count = 0;

        while (n != 0) {
            // Check if the last bit is 1
            if ((n & 1) == 1) {
                count++;
            }

            // Right shift n by 1 to check the next bit
            n = n >>> 1; // Use unsigned right shift to avoid issues with negative numbers
        }

        return count;   
    }
}