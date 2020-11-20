package leet;

import java.util.Arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * @author saraswathyInput: [9,6,4,2,3,5,7,0,1] Output: 8
 * 
 *
 */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i == nums[i])
				continue;
			else
				return i;
		}
		return nums.length;
	}


}
