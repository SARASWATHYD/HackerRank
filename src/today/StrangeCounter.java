package today;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		long d = 3;
		long ans = 0;
		while (2 > 1) {
			if (t <= d) {
				ans = d + 1 - t;
				break;
			} else {
				t -= d;
				d = 2 * d;
			}
		}
		System.out.println(ans);

	}

}
