package cyclicsort;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
 * @author saraswathy
 *
 */
public class FindAllMissingNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        return cyclicSort(nums);
	    }
	 private List<Integer> cyclicSort(int[] nums){

	        int i =0;
	        while(i<nums.length){
	            int correctIndex = nums[i]-1;
	            if(nums[i] != nums[correctIndex]){
	                swap(nums,i,correctIndex);
	            } else i++;
	        }
	        List<Integer> list = new ArrayList<>();
	        for(int index= 0; index <nums.length; index++){
	            if(nums[index]!=index+1){
	                list.add(index+1);
	            }
	        }
	        System.out.println(list);
	        return list;
	    
	    }
	    
	    private void swap(int[] num,int i , int j){
	        int temp = num[i];
	        num[i] = num[j];
	        num[j] = temp;
	    }

}
