package array;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
	/**
	 * Given an array of intervals
	 *  where intervals[i] = [starti, endi], merge all overlapping intervals, 
	 *  and return an array of the non-overlapping intervals that cover all the intervals in the input.
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
	 * @param intervals
	 * @return
	 */
	 public  List<List<Integer>> merge(int[][] intervals) {
		 List<List<Integer>> result = new ArrayList<>();
	        for(int i =0; i<intervals.length-1;i++){
	            int[] current = intervals[i];
	            int[] next = intervals[i+1];
	            List<Integer> list = mergeIndividual(current,next);
	            result.add(list);
	        }
	       
	        return result;
	    }
	 
	 private  List<Integer> mergeIndividual( int[] current,int[] next) {
		 List<Integer> list = new ArrayList();

		 int firstCurrent = current[0];
		 int secondCurrent = current[1];
		 int firstNext = next[0];
		 int secondNext = next[1];
		 //1-20 , {10,15}
		 if (secondCurrent >  firstNext) {
			 list.add( current[0]);
			 list.add(Math.max(secondCurrent,secondNext));	 
		 }
		 return list;
		 
	 }

}
