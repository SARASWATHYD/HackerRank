package leet;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(validaParenthesis(s));
	}

	public static boolean validaParenthesis(String str) {
		Stack<Character> stack = new Stack();
		int t = 010;
		int te = 07;

		System.out.println(t);
		System.out.println(te);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
				stack.pop();
			}

		}
		return stack.isEmpty();

	}
}
