import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {
	/***
	 * 
	 * Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is less than or equal to . For example, if your array is , you can create two subarrays meeting the criterion:  and . The maximum length subarray has  elements.

Function Description

Complete the pickingNumbers function in the editor below. It should return an integer that represents the length of the longest array that can be created.

pickingNumbers has the following parameter(s):

a: an array of integers

	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i = 0 ; i < n ; i++)
			ar[i] = sc.nextInt();
		
		System.out.println(pickingNumbers(ar));
	}
	static int pickingNumbers(int ar[]) {
		// Counting frequencies of elements  
        HashMap<Integer, Integer> freq = new HashMap<>();  
      
        for(int i = 0; i < ar.length; ++i) 
        {  
            if(freq.containsKey(ar[i]))  
                freq.put(ar[i], freq.get(ar[i]) + 1);  
            else
                freq.put(ar[i], 1);  
        }  
      
        // Finding max sum of adjacent indices  
        int ans = 0;  
      
        for (Integer key : freq.keySet())  
        {  
            if(freq.containsKey(key+1))  
                ans = Math.max(ans, freq.get(key) + freq.get(key+1));  
        }  
      
        return ans;  
}
	
	static int pickNumbers(int a[]) {
		
	        int[] count=new int[a.length-1];
	        Arrays.sort(a);
	        for(int i=0;i<a.length-1;i++){
	        	ArrayList<Integer> arr = new ArrayList<Integer>();
	            arr.add(a[i]);
	            for(int j=i+1;j<a.length;j++){
	                if(Math.abs(a[i]-a[j])==0||Math.abs(a[i]-a[j])==1){
	                    arr.add(a[j]);                    
	                }
	                
	            }
	            count[i]=arr.size();
	        }
	        Arrays.sort(count);
	        return count[count.length-1];
	    }
	}

