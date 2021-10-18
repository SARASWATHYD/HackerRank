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
		int t = 070;
		int te = 7;

		System.out.println(t); // 10 // 8

		System.out.println(te & 1);// 7

		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '(' || x == '{' || x == '[') {
				stack.push(str.charAt(i));
				continue;
			}
			if (stack.isEmpty()) // nothing got pushed into stack.
				return false;
			char peek;
			switch (x) {
			case '}':
				peek = stack.pop();
				if (peek == '(' || peek == '[')
					return false;

			case ']':
				peek = stack.pop();
				if (peek == '{' || peek == '(')
					return false;

			case ')':
				peek = stack.pop();
				if (peek == '{' || peek == '[')
					return false;

			}

		}
		return stack.isEmpty();

	}
}
