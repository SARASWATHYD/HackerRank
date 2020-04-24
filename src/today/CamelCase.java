package today;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		char[] str = in.toCharArray();
		int count = 1;
		for(int i =0; i < in.toCharArray().length;i++) {
			if (Character.isUpperCase(str[i]))
				count++;
		}
		System.out.println(count);
	}


}
