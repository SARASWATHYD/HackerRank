package leet;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Long num1 = Long.valueOf(sc.next());
		Long num2 = Long.valueOf(sc.next());
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 * num2);
		System.out.println(new BigInteger((String.valueOf(num1 * num2))));
	}

}
