package leet.interview;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean bal = new Palindrome().isPalindrome(sc.next());
		System.out.println(bal);
	}

	public boolean isPalindrome(String s) {
		boolean isPalin = true;
		System.out.println(s);
		s = s.toLowerCase().trim();
		s.replaceAll(" ", "");
		System.out.println(s);
		if (s == "")
			return true;
		System.out.println(s);

		for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
			isPalin = isPalin && s.charAt(i) == s.charAt(j);
		}
		return isPalin;
	}


}
