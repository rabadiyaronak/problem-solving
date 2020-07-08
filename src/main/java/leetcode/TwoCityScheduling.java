package leetcode;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoCityScheduling {

	private static final Logger log = Logger.getLogger(TwoCityScheduling.class.getName());

	public static void main(String[] args) {
		int result = new TwoCityScheduling()
				.twoCitySchedCost(new int[][] { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } });
		log.log(Level.INFO, "result={0}", result);
	}

	public int twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs, (c1, c2) -> Integer.compare(c2[1] - c2[0], c1[1] - c1[0]));
		int result = 0;
		for (int i = 0; i < costs.length; i++) {
			int val = (i < costs.length / 2) ? costs[i][0] : costs[i][1];
			result += val;
		}
		return result;
	}

}
