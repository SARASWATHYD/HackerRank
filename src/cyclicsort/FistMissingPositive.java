package cyclicsort;
/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.
 * @author saraswathy
 *
 *
 */
//Input: nums = [1,2,0]
//Output: 3
//Input: nums = [3,4,-1,1]
//Output: 2
//Input: nums = [7,8,9,11,12]
//Output: 1
public class FistMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int firstMissingPositive(int[] nums) {
	        int i =0;
	        //cyclic sort
	        while(i<nums.length){
	            int correct = nums[i]-1;
	            if(nums[i] > 0 && nums[i] <= nums.length && nums[i]!=nums[correct]){
	                swap(nums,i,correct);
	            } else i++;
	        }
	        //find missing number 
	        for(int index =0; index < nums.length;index++){
	            if(nums[index]!=index+1)
	                return index+1;
	        }
	        //if not present atlast give the size
	        return nums.length+1;
	    }
	    
	    private void swap(int[] nums,int i , int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
}
