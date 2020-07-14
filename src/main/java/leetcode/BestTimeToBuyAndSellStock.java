package leetcode;

import java.text.ParseException;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) throws ParseException {

		int[] prices = { 7, 1, 5, 3, 6, 4 };

		int profit = new BestTimeToBuyAndSellStock().maxProfit(prices);

		System.out.println(profit);

	}

	public int maxProfit(int[] prices) {
		int profit = 0;
		int minPrice = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else {
				profit = Math.max(profit, prices[i] - minPrice);
			}
		}
		return profit;
	}
}
