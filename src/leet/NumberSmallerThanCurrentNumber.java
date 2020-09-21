package leet;

import java.util.Scanner;

public class NumberSmallerThanCurrentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = new NumberSmallerThanCurrentNumber().smallerNumbersThanCurrent(arr);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);

	}

	public int[] smallerNumbersThanCurrent(int[] nums) {

		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i])
					count++;
			}
			result[i] = count;
		}
		return result;
	}

}
