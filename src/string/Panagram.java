package string;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		if (new Panagram().isPanagram(word))
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

	private boolean isPanagram(String input) {
		long c = input.toLowerCase().chars().filter(ch -> ch >= 'a' && ch <= 'z').distinct().count();
		return c == 26;
		}

}
