package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of integers, determine whether the array can be sorted in
 * ascending order using only one of the following operations one time.
 * 
 * Swap two elements. Reverse one sub-segment. Determine whether one, both or
 * neither of the operations will complete the task. If both work, choose swap.
 * For instance, given an array either swap the and , or reverse them to sort
 * the array. Choose swap. The Output Format section below details requirements.
 * 
 * Function Description
 * 
 * Complete the almostSorted function in the editor below. It should print the
 * results and return nothing.
 * 
 * almostSorted has the following parameter(s):
 * 
 * arr: an array of integers
 * 
 * @author saraswathy
 *
 */
public class AlmostSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = sc.nextInt();
		System.out.println(new AlmostSorted().checkSort(ar));
	}

	private String checkSort(int[] ar) {
		int[] br = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
			br[i] = ar[i];
		Arrays.sort(br, 0, ar.length);
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (br[i] != ar[i])
				count++;
		}
		return count == 0 ? "Yes" : "No";

	}

	private String reverseSort(int[] ar) {
		int[] br = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			br[i] = ar[i];
		}
		int front;
		for (front = 0; front < ar.length; front++) {
			if (ar[front] != ar[front])
				break;
		}
		int back;
		for (back = ar.length - 1; back > 0; back--) {
			if (ar[back] != ar[back])
				break;
		}
		return "";

	}
}
