package leet;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[sc.nextInt()];
		for (int i = 0; i < ar.length; i++)
			ar[i] = sc.nextInt();

		System.out.println("answer::" + removeDuplicates(ar));
	}

	public static int removeDuplicates(int[] nums) {
		int counter = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i--] != nums[i])
				nums[counter++] = nums[i];
		}
		System.out.println(counter);
		return counter;
	}
}
