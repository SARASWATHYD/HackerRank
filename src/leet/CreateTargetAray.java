package leet;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new ArrayList();
	        for(int i = 0; i < nums.length;i++){
	             list.add(index[i],nums[i]);
	        }
	       
	        int arr[] = new int[list.size()];
	    for(int i=0; i<list.size();i++)
	        arr[i] = list.get(i);
	    return arr;
	   
	    }
}
