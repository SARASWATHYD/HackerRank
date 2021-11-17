package cyclicsort;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int ans = new MissingNumber().missingNumber(arr);
		System.out.println(ans);
	}

	private int missingNumber(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			if(arr[i]!=arr[arr[i]]) {
				swap(arr,i,i);
			} else i++;
		}
		for(int index =0; index < arr.length; index++) {
			if(arr[index]!=index) {
				return index;
			} 
		} return  arr.length;
	}
	
	private void swap(int arr[], int i, int j) {
	
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
	}
}
