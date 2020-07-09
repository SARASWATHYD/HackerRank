package leet;

import java.util.Scanner;

/**
 * You have a total of n coins that you want to form in a staircase shape, where
 * every k-th row must have exactly k coins.
 * 
 * Given n, find the total number of full staircase rows that can be formed.
 * 
 * n is a non n = 5
 * 
 * The coins can form the following rows: ¤ ¤ ¤ ¤ ¤
 * 
 * Because the 3rd row is incomplete, we return 2.
 * 
 * @author saraswathy
 *
 */
public class ArrangeCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(arrange(sc.nextInt()));

	}

	private static int arrange(int num) {
		int counter = 0;
		int k = 1;
		while (num >= 0) {
			num = num - k;
			k++;
			counter++;
		}
		return counter - 1;
	}

}
