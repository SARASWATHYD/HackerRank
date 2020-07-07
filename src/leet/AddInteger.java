package leet;

import java.util.Scanner;

/**
 * 258. Add Digits Easy
 * 
 * 710
 * 
 * 1044
 * 
 * Add to List
 * 
 * Share Given a non-negative integer num, repeatedly add all its digits until
 * the result has only one digit.
 * 
 * Example:
 * 
 * Input: 38 Output: 2 Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 * Since 2 has only one digit, return it. Follow up:
 * 
 * @author saraswathy
 *
 */
public class AddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(addToSingleInt(sc.nextInt()));

	}

	private static int addToSingleInt(int num) {
		int last = 0;
		int sum = 0;
		while (num > 0) {
			last = num % 10;
			sum = sum + last;
			num = num / 10;
		}

		return sum > 9 ? addToSingleInt(num) : sum;
	}
}
