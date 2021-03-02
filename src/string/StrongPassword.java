package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		String pswd = sc.next();
		System.out.println("counter::" + new StrongPassword().getStrength(pswd));


	}

	private int getStrength(String input) {
		boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
		Set<Character> set = new HashSet(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
		for (char i : input.toCharArray()) {
			if (Character.isLowerCase(i))
				hasLower = true;
			if (Character.isUpperCase(i))
				hasUpper = true;
			if (Character.isDigit(i))
				hasDigit = true;
			if (set.contains(i))
				specialChar = true;
		}
		int counter = 0;
		if (input.length() >= 6) {

			if (!hasLower)
				counter++;
			if (!hasUpper)
				counter++;
			if (!hasDigit)
				counter++;
			if (!specialChar)
				counter++;
		} else
			counter = 6 - input.length();
		return counter;
	}
}
