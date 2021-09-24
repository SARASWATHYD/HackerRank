package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = new TwoSum().twoSum(new int[] { 3, 2, 4 }, 6);
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	// if array is already sorted
	public int[] twoSum(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] == target)
				return new int[] { left, right };

			else if (nums[left] + nums[right] < target)
				left++;
			else
				right--;

		}
		return new int[2];
	}

	// if not
	public int[] twoSumInMap(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// { 3, 2, 4 }, 6
		for (int i = 0; i < nums.length; i++) {
			// putting in map by minusing with target {6-3,index} if found returning current
			// index and map index value
			if (map.containsKey(nums[i])) {
				return new int[] { i, map.get(nums[i]) };
			} else {
				map.put((target - nums[i]), i);
			}
		}
		return new int[2];
	}

}
