package cyclicsort;
/**
 * https://leetcode.com/problems/set-mismatch/
 * @author saraswathy
 *
 *You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 */

//Example 1:
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
public class SetMisMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] findErrorNums(int[] nums) {

	        int i =0;
	        while(nums.length > i){
	            int correct = nums[i]-1;
	            if(nums[i]!=nums[correct])
	                swap(nums,i,correct);
	            else i++;
	        }
	        //search for missing number
	        for(int index =0; index<nums.length;index++){
	            if(nums[index]!=index+1)
	               return new int[]{nums[index],index+1};
	               
	        }
	        return new int[]{-1,-1};
	    }
	    
	    private void swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }

}
