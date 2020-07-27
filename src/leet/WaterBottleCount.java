package leet;

import java.util.Scanner;

/**
 * 
 * Input: numBottles = 9, numExchange = 3 Output: 13 Explanation: You can
 * exchange 3 empty bottles to get 1 full water bottle. Number of water bottles
 * you can drink: 9 + 3 + 1 = 13.
 * 
 * @author saraswathy
 *
 */
public class WaterBottleCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(new WaterBottleCount().numWaterBottles(sc.nextInt(), sc.nextInt()));
	}

	public int numWaterBottles(int numBottles, int numExchange) {
		return drink(numBottles, numExchange, 0);
	}

	private int drink(int numBottles, int numExchange, int remainder) {

		if (numBottles == 0 && remainder < numExchange)
			return 0;

		if (remainder >= numExchange) {
			numBottles += remainder / numExchange;
			remainder = remainder % numExchange;
		}
		return numBottles + drink(numBottles / numExchange, numExchange, remainder + numBottles % numExchange);
	}

}
