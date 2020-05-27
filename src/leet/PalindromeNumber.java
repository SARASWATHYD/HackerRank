package leet;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int str1 = sc.nextInt();
		String str = String.valueOf(str1);
		char[] s_char = str.toCharArray();
		boolean isPalindrome = true;
		for (int x = 0, y = s_char.length - 1; x < s_char.length; x++, y--)
			isPalindrome = isPalindrome && s_char[x] == s_char[y] ? true : false;


		System.out.println(isPalindrome);
	}

}
