package leet;

import java.util.Scanner;

public class TripletZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++)
			numbers[i] = sc.nextInt();
		findTriplet(numbers);

	}

	private static void findTriplet(int[] numbers) {

		// find combination of three numbers get that sum check whtehre it is ===0
		findCombination(numbers);

	}

	private static void findCombination(int[] numbers) {
		int requiredNumbers[] = new int[3];
		int index = 0;
		int start = 0;
		int end = numbers.length - 1;

		if (index == 3) {
			for (int j = 0; j < 3; j++)
				System.out.print(requiredNumbers[j] + " ");
			System.out.println("");
			return;
		}
		for (int i = start; i <= end && end - i + 1 >= 3 - index; i++) {
			requiredNumbers[index] = numbers[i];
			start++;
			index++;
			findCombination(numbers);

		}
	}
}
