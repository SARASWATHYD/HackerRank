package leet;

import java.util.Scanner;

/**
 * Input: n = 234 Output: 15 Explanation: Product of digits = 2 * 3 * 4 = 24 Sum
 * of digits = 2 + 3 + 4 = 9 Result = 24 - 9 = 15
 * 
 * @author saraswathy
 *
 */

public class ProductSum {

	public int subtractProductAndSum(int n) {
		int sum = 0, product = 1;
		while (n > 0) {
			sum = sum + n % 10;
			product = product * n % 10;
			n = n / 10;
		}
		return product - sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(new ProductSum().subtractProductAndSum(sc.nextInt()));

	}

}
