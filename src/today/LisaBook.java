package today;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LisaBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int pageRestriction = sc.nextInt();
		int pages = 0;
		int special = 0;
		if (pageRestriction > 0)
			special++;

		int chapter[] = new int[size];
		for (int i = 0; i < size; i++)
			chapter[i] = sc.nextInt();
		List<List> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			List pageList = new ArrayList<>(3);
			for (int j = 0; j < 3; j++) {

			}
			pages = chapter[i] / pageRestriction;
			pages = pages + chapter[i] % pageRestriction;

		}

	}

}
