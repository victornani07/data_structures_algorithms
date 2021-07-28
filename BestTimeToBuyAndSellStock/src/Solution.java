public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, profit = 0, i = 0;

        while(i < prices.length - 1) {
            while(i < prices.length - 1 && prices[i] >= prices[i + 1])
                ++i;

            if(prices[i] < min)
                min = prices[i++];

            while(i < prices.length - 1 && prices[i] <= prices[i + 1])
                ++i;

            if(prices[i] > max)
                max = prices[i++];

            if(max - min > profit)
                profit = max - min;

        }

        return profit;
    }
}
