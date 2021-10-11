package array;

public class PlusOne {
	public int[] plusOne(int[] digits) {

		boolean carry = true;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9 && carry) {
				digits[i] = digits[i] + 1;
				carry = false;
				return digits;
			} else {
				carry = true;
				digits[i] = 0;
				if (i == 0) {
					int[] ar = new int[digits.length + 1];
					ar[0] = 1;
					return ar;
				}
			}

		}
		return digits;
	}
}
