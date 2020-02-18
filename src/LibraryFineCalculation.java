import java.util.Scanner;

public class LibraryFineCalculation {
	
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int m1 = sc.nextInt();
		int y1 = sc.nextInt();
		int d2 = sc.nextInt();
		int m2 = sc.nextInt();
		int y2 = sc.nextInt();
		if (y1 > y2)
			System.out.println(10000);
		if (y1 <= y2) {
			if (m1 <= m2) {
				if (d1 <= d2)
					System.out.println(0);
				else
					System.out.println((d1 - d2) * 15);
			} else
				System.out.println((m1 - m2) * 500);

		}
	}

}
