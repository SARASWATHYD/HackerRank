package today;

import java.util.Scanner;

public class ReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while (true) {
			// Used for loop termination
			int len = str.length();

			// "(.)" is a capturing group that captures any character
			// "\\1" is a backreference that will match the character captured by the first
			// capturing group (i.e. the one captured by "(.)")
			str = str.replaceAll("(.)\\1", "");

			// If no changes were made to string, break loop
			if (str.length() == len) {
				break;
			}
		}

		System.out.println((str.isEmpty()) ? "Empty String" : str);

	}

//	public static String findDuplicateReduce(String s) {
//		if (s.length() == 1)
//			return s;
//		if (s.trim().isEmpty())
//			return "Empty String";
//		for (int i = 1; i < s.length(); i++) {
//			if (s.charAt(i) == s.charAt(i - 1))
//				return findDuplicateReduce(s.substring(0, i - 1) + s.substring(i + 1));
//		}
//		return s;

//	}
}
