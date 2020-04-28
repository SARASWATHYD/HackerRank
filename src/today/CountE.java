package today;

import java.util.Scanner;

public class CountE {
	static int ecount(String s) {
		int ecount = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'e')
				ecount++;
		return ecount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(CountE.ecount(sc.next()));
	}

}
