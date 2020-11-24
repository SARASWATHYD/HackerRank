package sorting;

import java.util.Scanner;

/**
 * Consider the following version of Bubble Sort:
 * 
 * for (int i = 0; i < n; i++) {
 * 
 * for (int j = 0; j < n - 1; j++) { // Swap adjacent elements if they are in
 * decreasing order if (a[j] > a[j + 1]) { swap(a[j], a[j + 1]); } }
 * 
 * } Given an array of integers, sort the array in ascending order using the
 * Bubble Sort algorithm above. Once sorted, print the following three lines:
 * 
 * Array is sorted in numSwaps swaps., where is the number of swaps that took
 * place. First Element: firstElement, where is the first element in the sorted
 * array. Last Element: lastElement, where is the last element in the sorted
 * array. Hint: To complete this challenge, you must add a variable that keeps a
 * running tally of all swaps that occur during execution.
 * 
 * For example, given a worst-case but small array to sort: we go through the
 * following steps:
 * 
 * 
 * @author saraswathy
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new BubbleSort().bubbleSort(a);
	}

	private void bubbleSort(int[] a) {
		int counter = 0;


		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					counter++;
//					swap(a[j], a[j + 1],a,j);
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		System.out.println("counter ::" + counter);
		System.out.println("first ::" + a[0]);
		System.out.println("last ::" + a[a.length - 1]);

	}

}
