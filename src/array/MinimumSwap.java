package array;

import java.util.Scanner;

public class MinimumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println(new MinimumSwap().minSwapsToSort(arr));

	}

	private int minSwapsToSort(int ar[]) {

		int counter = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == i + 1)
				continue;
			counter++;
			int temp = ar[i];
			ar[i] = ar[temp - 1];
			ar[temp - 1] = temp;
			i--;
		}

		return counter;
	}

}
