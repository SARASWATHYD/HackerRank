import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List list = new ArrayList(3);
		int size = sc.nextInt();
		int diff = sc.nextInt();
		int counter = 0;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[j] - arr[i] == diff) {
					for (int k = j + 1; k < size; k++) {
						if (arr[k] - arr[j] == diff) {
							counter++;
						}
					}
				}
			}
		}
		System.out.println(counter);

	}

}
