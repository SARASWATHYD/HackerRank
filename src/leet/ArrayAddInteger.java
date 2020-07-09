package leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayAddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int addVal = sc.nextInt();
		System.out.println(addToArrayForm(arr, addVal));

	}

	public static List<Integer> addToArrayForm(int[] arr, int k) {
		String s = "";
		for (int i = 0; i < arr.length; i++)
			s = s + arr[i];

		int test = Integer.valueOf(s) + k;
		System.out.println(test);
		String textVal = String.valueOf(test);
		System.out.println(textVal);
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < textVal.length(); i++) {
			System.out.println(textVal.charAt(i));
			list.add(Integer.valueOf(textVal.charAt(i) + ""));
		}

		return list;
	}
}
