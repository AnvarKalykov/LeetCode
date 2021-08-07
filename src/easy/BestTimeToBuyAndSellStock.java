package easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else if (prices[i] - min > max_profit) {
                max_profit = prices[i] - min;
            }
        }
        return max_profit;
    }
}
