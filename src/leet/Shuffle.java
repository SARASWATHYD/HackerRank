package leet;

/***
 * 1470. Shuffle the Array Easy
 * 
 * 231
 * 
 * 26
 * 
 * Add to List
 * 
 * Share Given the array nums consisting of 2n elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn].
 * 
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,5,1,3,4,7], n = 3 Output: [2,3,5,4,1,7] Explanation: Since
 * x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 * 
 * @author saraswathy
 *
 */
public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] shuffle(int[] nums, int n) {
		int[] array = new int[nums.length];
		for (int i = 0; i < n; i += 2) {
			array[2 * i] = nums[i];
			array[2 * i + 1] = nums[i + n];
		}
		return array;
	}

}
