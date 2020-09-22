package leet;

public class SubtractSumFromProduct {

	public int subtractProductAndSum(int n) {
		int sum = 0, product = 1;
		while (n > 0) {
			int lastdig = n % 10;
			sum = sum + lastdig;
			product = product * lastdig;
			n = n / 10;
		}
		return product - sum;
	}

}
