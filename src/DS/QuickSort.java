package DS;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int ar[] = new int[size];
		for (int i = 0; i < size; i++)
			ar[i] = sc.nextInt();
		System.out.println(quicksort(ar));

	}

	private static int[] quicksort(int ar[]) {
		int pivot = ar[0];
		int left = 0;
		int right = ar.length - 1;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > pivot)
				right++;
			else
				left++;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		return ar;

	}

}
