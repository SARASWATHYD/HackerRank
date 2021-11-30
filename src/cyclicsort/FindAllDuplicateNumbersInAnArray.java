package cyclicsort;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
 * @author saraswathy
 *Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.
 */
public class FindAllDuplicateNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<Integer> findDuplicates(int[] nums) {
	        List<Integer> list = new ArrayList<>();
	        int i =0;
	        while(i < nums.length){
	            int correctIndex = nums[i]-1;
	            if(nums[i]!=nums[correctIndex]){
	                swap(nums,i,correctIndex);
	            } else i++;
	        }
	        
	        for(int index =0; index<nums.length; index++){
	            if(nums[index] != index+1)
	               list.add(nums[index]);
	            else if(nums[index] == 2) {
	            	
	            }
	        }
	        return list;
	    }
	    private void swap(int[] nums, int i , int j){
	       int temp = nums[i];
	        nums[i]= nums[j];
	        nums[j] = temp;
	        
	    }

}
