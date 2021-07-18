public class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, n = prices.length, profit = 0;

        while(i < n - 1) {
            while(i < n - 1 && prices[i + 1] <= prices[i])
                ++i;

            if(i == n - 1)
                return profit;

            int buy = i;

            while(i < n - 1 && prices[i + 1] >= prices[i])
                ++i;

            int sell = i;
            profit = profit + prices[sell] - prices[buy];
        }

        return profit;
    }
}
