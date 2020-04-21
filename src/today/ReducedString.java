package today;

import java.util.Scanner;

public class ReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(findDuplicateReduce(str));
	}

	public static String findDuplicateReduce(String s) {
		if (s.length() == 1)
			return s;
		if (s.trim().isEmpty())
			return "Empty String";
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1))
				return findDuplicateReduce(s.substring(0, i - 1) + s.substring(i + 1));
		}
		return s;

	}
}
