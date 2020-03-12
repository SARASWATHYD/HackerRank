package today;

import java.util.Scanner;

public class LisaBook {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int numProblems, specialProblems = 0, pageNumber = 0;
		for (int i = 0; i < n; i++) {
			numProblems = sc.nextInt();
			pageNumber++; // increase for new chapter
			int problem = 1;
			while (numProblems > 0) {
				numProblems--;
				if (problem == pageNumber) {
					specialProblems++;
				}
				if (problem % k == 0 && numProblems != 0) {
					pageNumber++; // increase for full page
				}
				problem++;
			}
		}
		System.out.println(specialProblems);

	}
}
