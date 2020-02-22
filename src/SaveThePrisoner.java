import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for (int i = 0; i < testcases; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			saveprisoner(m, n, s);
		}

	}

	private static void saveprisoner(int m, int n, int s) {
		int lt, seat, lMinusN;
		int rem = m % n;

		if (s == 1) {
			if (rem == 0) {
				seat = n;
			} else {
				seat = rem;
			}

		} else {
			lt = s - 1;

			if (rem == 0) {

				seat = lt;
			} else {
				int temp = lt + rem;
				if (temp <= n) {
					seat = temp;
				} else {

					lMinusN = Math.abs(lt - n);
					seat = rem - lMinusN;

				}
			}

		}

		System.out.println(seat);
	}

}
