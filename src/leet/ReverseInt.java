package leet;

import java.math.BigInteger;
import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		reverse(x);
		System.out.println(reverse(x));
	}

	public static int reverse(int n) {


		long reverse = 0;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}

		String str = String.valueOf(reverse);
		String max = String.valueOf(Integer.MAX_VALUE);
		String min = String.valueOf(Integer.MIN_VALUE);
		BigInteger b1 = new BigInteger(str);
		BigInteger b_max = new BigInteger(max);
		BigInteger b_min = new BigInteger(min);
		boolean isOutOfRange = b1.compareTo(b_max) > 0 || b1.compareTo(b_min) < 0;
		return isOutOfRange ? 0 : (int) reverse;



	}

}
