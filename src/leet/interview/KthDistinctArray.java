package leet.interview;

import java.util.HashMap;
import java.util.Map;

/*
 * A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.
 */
public class KthDistinctArray {

	//Input: arr = ["d","b","c","b","c","a"], k = 2
//	Output: "a"
//		Explanation:
//		The only distinct strings in arr are "d" and "a".
//		"d" appears 1st, so it is the 1st distinct string.
//		"a" appears 2nd, so it is the 2nd distinct string.
//		Since k == 2, "a" is returned. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> distinct = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            if(distinct.containsKey(arr[i]))
            	distinct.put(arr[i], distinct.get(arr[i])+1);
            else distinct.put(arr[i], 1);
    }
       for(String s : arr) {
    	   if(distinct.get(s)==1) {
    		   if(k==1)
    			   return s;
    		   else k--;
    	   }
       }
       return "";
}
}
