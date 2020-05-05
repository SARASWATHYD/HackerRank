package DS;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Consider an array of numeric strings where each string is a positive number
 * with anywhere from to digits. Sort the array's elements in non-decreasing, or
 * ascending order of their integer values and print each element of the sorted
 * array on a new line.
 * 
 * Function Description
 * 
 * Complete the bigSorting function in the editor below. It should return the
 * sorted string array.
 * 
 * bigSorting has the following parameter(s):
 * 
 * unsorted: an unsorted array of integers as strings
 * 
 * @author saraswathy
 *
 */

public class BiggerIsGreater {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		List<BigInteger> big = new ArrayList<>();
//		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			big.add(sc.nextBigInteger());
//		}
//		System.out.println(findAscendingBig(big));
//
//	}
//
//	private static List findAscendingBig(List<BigInteger> num ) {
//		
//		for(BigInteger big : num) {
//			if(big.min(val))
//		}
//	}
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		BigInteger[] numbers = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = new BigInteger(sc.next());
		}

		Arrays.sort(numbers);

		for (int i = 0; i < n; i++)
			System.out.println(numbers[i]);
	}
}
