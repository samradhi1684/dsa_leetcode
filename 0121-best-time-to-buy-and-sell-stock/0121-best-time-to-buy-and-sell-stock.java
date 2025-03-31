class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0; // Edge case

        int minPrice = Integer.MAX_VALUE; // Track the minimum price
        int maxProfit = 0; // Track the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update min price if a lower price is found
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate profit
            }
        }

        return maxProfit; // Return the max profit found
    }
}
