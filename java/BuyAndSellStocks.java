import java.util.*;

public class BuyAndSellStocks {
    public static int stocksPrices(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {// profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
              //time compelexity of this code is O(n)
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stocksPrices(prices));

    }

}
