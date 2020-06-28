package leet;

import java.util.Scanner;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 * 
 * @author saraswathy
 *
 */

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] array = new int[sc.nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ind[] = twoSum(array, target);
		for (int i = 0; i < ind.length; i++) {
			System.out.println(ind[i]);
		}

	}

	private static int[] twoSum(int[] nums, int target) {
		int counter = 0;
		int[] index = new int[2];
		while (nums.length > counter) {
			for (int i = counter + 1; i < nums.length; i++) {
				if (nums[counter] + nums[i] == target) {
					index[0] = counter;
					index[1] = i;
				}
			}
			counter++;
		}
		return index;
	}

}
