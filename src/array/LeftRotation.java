package array;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rotation = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int ar[] = new LeftRotation().rotateLeft(arr, rotation);


	}

	private int[] rotateLeft(int[] ar, int rotations) {
		int j = 0;
		while (j < rotations) {
			moveLeft(ar);
			j++;
		}

		return ar;
	}

	private void moveLeft(int[] ar) {
		int last = ar[0];
		for (int i = 1; i < ar.length; i++)
			ar[i - 1] = ar[i];
		ar[ar.length - 1] = last;

	}
}


