package leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findDuplicate(int[] nums) {
		int i = 0;
		Set set = new HashSet<>(Arrays.asList(nums));

		while (nums.length > i) {

			if (!set.add(nums[i]))
				return nums[i];
		}
		return 0;
	}
}
