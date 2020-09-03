package leet;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("answer::" + new BinarySearch().binarySearch(sc.nextInt(), arr));
	}

	private int binarySearch(int search, int[] arr) {
		int ind = 0;
		System.out.println("search elem ::" + search);
		int left = 0, right = arr.length - 1;
		while(left<=right) {
			int mid = (left + right) / 2;
			if(arr[mid] < search) {
				left = mid+1;
			} else if (arr[mid] > search)
				right = mid - 1;
			else if (arr[mid] == search) {
				ind = mid;
				break;
			}

		}
		return ind;
	}
}
