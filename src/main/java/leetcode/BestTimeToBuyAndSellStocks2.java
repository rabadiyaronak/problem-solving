package leetcode;

public class BestTimeToBuyAndSellStocks2 {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
//		int[] prices = { 7, 6, 4, 3, 2, 1 };
		int profit = new BestTimeToBuyAndSellStocks2().maxProfit(prices);
		System.out.println(profit);
	}

	public int maxProfit(int[] prices) {
		int profit = 0;

		if (prices == null || prices.length == 0) {
			return profit;
		}

		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] > prices[i]) {
				profit += prices[i + 1] - prices[i];
			}
		}

		return profit;
	}
}
