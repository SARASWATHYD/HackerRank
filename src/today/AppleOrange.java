package today;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int d, ans1 = 0, ans2 = 0;
		int s = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 0; i < m; i++) {
			d = sc.nextInt();
			d = a + d;
			if (d >= s && d <= t)
				ans1++;
		}
		for (int i = 0; i < n; i++) {
			d = sc.nextInt();
			d = b + d;
			if (d >= s && d <= t)
				ans2++;
		}
		System.out.println(ans1);
		System.out.println(ans2);

	}

}
