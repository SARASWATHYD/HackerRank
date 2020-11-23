package sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Mark and Jane are very happy after having their first child. Their son loves
 * toys, so Mark wants to buy some. There are a number of different toys lying
 * in front of him, tagged with their prices. Mark has only a certain amount to
 * spend, and he wants to maximize the number of toys he buys with this money.
 * 
 * Given a list of prices and an amount to spend, what is the maximum number of
 * toys Mark can buy? For example, if and Mark has to spend, he can buy items
 * for , or for units of currency. He would choose the first group of items.
 * 
 * Function Description
 * 
 * Complete the function maximumToys in the editor below. It should return an
 * integer representing the maximum number of toys Mark can purchase.
 * 
 * maximumToys has the following parameter(s):
 * 
 * prices: an array of integers representing toy prices k: an integer, Mark's
 * budget
 * 
 * @author saraswathy
 *
 */
public class MarkAndToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amount = sc.nextInt();
		int price[] = new int[n];
		for (int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
		}

		int size = new MarkAndToys().findMaxToysInBudjet(price, amount);

		System.out.println(size);
	}

	private int findMaxToysInBudjet(int[] price, int amount) {
		Arrays.parallelSort(price);
		int budget = amount;
		int count = 0;
		for (Integer toyPrice : price) {
			if (toyPrice <= amount) {
				count++;
				budget = budget - toyPrice;
			}
		}
		return count;
	}

}
