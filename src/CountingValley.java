import java.util.Scanner;

public class CountingValley {

	public static void main(String ar[]) {
		int count = 0;
		int level = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] upsDown = s.toCharArray();
		for (int i = 0; i < n; i++) {

			if (upsDown[i] == 'U')
				level++;
			if (upsDown[i] == 'D')
				level--;

			if (level == 0 && upsDown[i] == 'U')
				count++;
		}
		System.out.println(count);
	}


}
