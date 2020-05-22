package leet;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("+-2"));

	}

	public static int myAtoi(String str) {
		String str1 = str;
		try {
			str1 = str.split("\\.")[0];
			System.out.println(str1);
			if (str1 == null || str1.equals("") || !isNumber(str1.trim().charAt(0)) || str1 == "-")
			return 0;
			String trim = str1.trim();

		String test = trimNumberString(trim);

		System.out.println(Integer.parseInt(test));

		return Integer.valueOf(test);
		} catch (NumberFormatException e) {
			return str1.length() > 1 && (str1.trim().charAt(0) == '-') ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		}

	}

	private static String trimNumberString(String trim) {
		String compited = "";
		for (int i = 0; i < trim.length(); i++) {
			if (trim.charAt(i) == '0' || trim.charAt(i) == '1' || trim.charAt(i) == '2' || trim.charAt(i) == '3'
					|| trim.charAt(i) == '4' || trim.charAt(i) == '5' || trim.charAt(i) == '6' || trim.charAt(i) == '7'
					|| trim.charAt(i) == '8' || trim.charAt(i) == '9' || trim.charAt(i) == '-'
					|| trim.charAt(i) == '+') {

				if (trim.charAt(i) == '-' && trim.charAt(i + 1) == '+')
					return "0";
			}

				compited = compited + "" + trim.charAt(i);

		}
		return compited;
		

	}

	private static boolean isNumber(char trim) {

		if (trim == '0' || trim == '1' || trim == '2' || trim == '3' || trim == '4' || trim == '5' || trim == '6'
				|| trim == '7' || trim == '8' || trim == '9' || trim == '-' || trim == '+')
			return true;
		else
			return false;

	}
}
