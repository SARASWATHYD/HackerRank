package evenOdd;

public class EvenOddChecking {

	// using and
	private boolean isOdd(int n) {
		return (n & 1) == 1;
	}

	// using xor
	static boolean isEven(int n) {

		// n^1 is n+1, then even, else odd
		if ((n ^ 1) == n + 1)
			return true;
		else
			return false;
	}

	// or
	static boolean iseven(int n) {

		// n|1 is greater than n, then even, else odd
		if ((n | 1) > n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddChecking events = new EvenOddChecking();
		System.out.println(events.isOdd(12));

	}

}
