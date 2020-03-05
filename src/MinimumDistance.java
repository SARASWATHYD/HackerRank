import java.util.Arrays;
import java.util.Scanner;

public class MinimumDistance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int index1 = 0;
		int index2 = 0;
		int A[] = new int[n];
		int B[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
			B[A_i] = A[A_i];
		}
		int j = 0;
		Arrays.sort(B);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			if (B[i] == B[i + 1]) {
				for (j = 0; j < n; j++) {
					if (A[j] == B[i]) {
						index1 = j;
						break;
					}
				}
				for (j = j + 1; j < n; j++) {
					if (A[j] == B[i]) {
						index2 = j;
						break;
					}
				}
				if ((Math.abs(index2 - index1) < min)) {
					min = Math.abs(index2 - index1);
				}
			}
		}
		int z = -1;
		if (min != Integer.MAX_VALUE)
			System.out.println(min);
		else
			System.out.println(z);
		}

}
