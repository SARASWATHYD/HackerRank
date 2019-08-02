
import java.io.IOException;
import java.util.Scanner;

public class BookPageTurnAlgorithm {

		// TODO Auto-generated method stub
	static int pageCount(int n, int p) {
		/*
		 * Complete the pageCount function in the editor below. It should return the
		 * minimum number of pages Brie must turn. pageCount has the following
		 * parameter(s): n: the number of pages in the book p: the page number to turn
		 * to
		 */
		int maxpageturn = n / 2;
		int minpageturn = p / 2;
		int result = maxpageturn - minpageturn;
		result = result < minpageturn ? result : minpageturn;
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();


		int p = scanner.nextInt();


		int result = pageCount(n, p);

		System.out.println(result);
	}
	}
