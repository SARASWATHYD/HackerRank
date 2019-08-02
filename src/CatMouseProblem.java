
import java.util.Scanner;

public class CatMouseProblem {

	/**
	 * *
	 * 
	 * @param cat1
	 * @param cat2
	 * @param mouse
	 * @return Two cats and a mouse are at various positions on a line. You will be
	 *         given their starting positions. Your task is to determine which cat
	 *         will reach the mouse first, assuming the mouse doesn't move and the
	 *         cats travel at equal speed. If the cats arrive at the same time, the
	 *         mouse will be allowed to move and it will escape while they fight.
	 * 
	 *         You are given queries in the form of , , and representing the
	 *         respective positions for cats and , and for mouse . Complete the
	 *         function to return the appropriate answer to each query, which will
	 *         be printed on a new line.
	 * 
	 *         If cat catches the mouse first, print Cat A. If cat catches the mouse
	 *         first, print Cat B. If both cats reach the mouse at the same time,
	 *         print Mouse C as the two cats fight and mouse escapes. For example,
	 *         cat is at position and cat is at . If mouse is at position , it is
	 *         units from cat and unit from cat . Cat will catch the mouse.
	 * 
	 * 
	 */
	static String catAndMouse(int cat1, int cat2, int mouse) {
		if (Math.abs(mouse - cat1) > Math.abs(mouse - cat2))
			return "Cat B";
		else if (Math.abs(mouse - cat1) < Math.abs(mouse - cat2))
			return "Cat A";
		else
			return "Mouse C";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int cat1 = sc.nextInt();
			int cat2 = sc.nextInt();
			int mouse = sc.nextInt();

			System.out.println(catAndMouse(cat1, cat2, mouse));

		}
	}
}


