package DS;

import java.util.Scanner;

public class CircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int rotation_count = sc.nextInt();
		int queries_count = sc.nextInt();
		int ar[] = new int[number];
		for (int i = 0; i < number; i++)
			ar[i] = sc.nextInt();
		int[] c_ar = cirularRotation(ar, rotation_count);
		for (int i = 0; i < queries_count; i++) {
			System.out.println(c_ar[sc.nextInt()]);
			System.out.println(c_ar[sc.nextInt()]);
			System.out.println(c_ar[sc.nextInt()]);
		}

	}

	private static int[] cirularRotation(int[] ar, int count) {
		for (int j = 0; j < count; j++) {
			int temp = ar[ar.length - 1];
			for (int i = ar.length - 1; i > 0; i--)
				ar[i] = ar[i - 1];
			ar[0] = temp;
		}
		return ar;
	}

}
