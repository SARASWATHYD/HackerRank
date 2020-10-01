package leet;

import java.util.Arrays;
import java.util.Scanner;

public class FIndFirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int target = sc.nextInt();
		Arrays.sort(arr);
		int[] result = new FIndFirstAndLastOccurance().searchRange(arr, target);
		for(int i =0; i < result.length;i++) {
			System.out.println(result[i]);
		}

	}

	private int[] searchRange(int[] arr, int target) {

		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] < target) {
				left = mid + 1;
			} else if (arr[mid] > target)
				right = mid - 1;
			else if (arr[mid] == target) {
//				ind = mid;
				break;
			}

		}
		return new int[2];
	}

}
