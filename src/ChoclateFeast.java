import java.util.Scanner;

public class ChoclateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			int money = sc.nextInt();
			int cost = sc.nextInt();
			int wrappers = sc.nextInt();
			System.out.println(findNumberofChoclates(money, cost, wrappers));
		}

	}

	private static int findNumberofChoclates(int money, int cost, int wrappers) {
		
		int choclates = money / cost;
		int leftWrapper = choclates % wrappers;
		int recentChoclate = choclates / wrappers;
		int addon = (leftWrapper + recentChoclate) / wrappers;
		choclates = choclates + recentChoclate + addon;

		return choclates;
	}

}
