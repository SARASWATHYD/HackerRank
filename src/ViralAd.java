import java.util.Scanner;

public class ViralAd {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		double y = 5;
		int count = 0;
		int z = 0;
		while (count < n) {
			y = Math.floor(y / 2);
			z = (int) Math.round(y) + z;
			y = y * 3;
			count++;
		}

		System.out.println(z);
	}
}